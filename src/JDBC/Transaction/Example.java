package JDBC.Transaction;

import java.sql.*;
import java.util.Scanner;

public class Example {
    private static final String url = "jdbc:mysql://127.0.0.1:3306/Transaction";
    private static final String user = "root";
    private static final String password = "Ansh@2004";

    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

        try{
            Connection connection = DriverManager.getConnection(url, user, password);
            String debit = "UPDATE Accounts SET balance_$ = balance_$ - ? WHERE account_number = ?";
            String credit = "UPDATE Accounts SET balance_$ = balance_$ + ? WHERE account_number = ?";

            PreparedStatement debitStatement = connection.prepareStatement(debit);
            PreparedStatement creditStatement = connection.prepareStatement(credit);

            System.out.println("Enter Sender's Account Details: ");

            System.out.print("Enter account_number: ");
            int acc_num1 = Sc.nextInt();

            System.out.print("Enter amount to Transfer: ");
            double am = Sc.nextDouble();

            System.out.println("Enter Receiver's Account Details: ");

            System.out.print("Enter account_number: ");
            int acc_num2 = Sc.nextInt();

            initiatingTransaction();

            boolean res = isSufficient(connection, acc_num1, am);

            if(res){
                debitStatement.setDouble(1, am);
                debitStatement.setDouble(2, acc_num1);
                creditStatement.setDouble(1, am);
                creditStatement.setDouble(2, acc_num2);
                debitStatement.executeUpdate();
                creditStatement.executeUpdate();

                System.out.println("Transaction Successful");
            }else System.out.println("Insufficient balance!!");


        }catch(SQLException e){
            System.out.println(e.getMessage());
        }

    }

    public static boolean isSufficient(Connection connection, int account_number, double amount){
        String query = " SELECT * FROM Accounts WHERE account_number = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, account_number);

            ResultSet resultSet = preparedStatement.executeQuery();

            if(resultSet.next()){
                int account_num = resultSet.getInt("account_number");
                double balance = resultSet.getDouble("balance_$");

                if(amount<=balance){
                    return true;
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return false;
    }

    public static void initiatingTransaction(){
        System.out.print("initiatingTransaction");
        for(int i=0;i<10;i++){
            try {
                Thread.sleep(200);
                System.out.print(".");
            } catch (InterruptedException e) {
                e.getMessage();
            }
        }
        System.out.println();
    }
}
