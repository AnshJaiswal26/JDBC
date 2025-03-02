package JDBC.PreparedStatement;

import java.sql.*;
import java.util.Scanner;

public class A3BatchInsertData {
    private static final String url = "jdbc:mysql://localhost:3306/jdbc";
    private static final String user = "root";
    private static final String password = "Ansh@2004";

    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.getMessage();
        }

        try{

            Connection connection = DriverManager.getConnection(url,user,password);

            String query = "INSERT INTO student (id, name, age, marks) VALUES (?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);

            while(true){

                System.out.print("Enter id: ");
                int id = Sc.nextInt();

                System.out.print("Enter name: ");
                String name = Sc.next();

                System.out.print("Enter age: ");
                int age = Sc.nextInt();

                System.out.print("Enter marks: ");
                double marks = Sc.nextDouble();

                preparedStatement.setInt(1, id);
                preparedStatement.setString(2,name);
                preparedStatement.setInt(3, age);
                preparedStatement.setDouble(4, marks);

                preparedStatement.addBatch();

                System.out.print("Enter more data ? : (Y/N): ");
                String choice = Sc.next();

                if(choice.toUpperCase().equals("N")){
                    break;
                }
            }

            int [] arr  = preparedStatement.executeBatch();

            for(int i =0;i<arr.length;i++){
                if(arr[i] == 0){
                    System.out.println("Data not inserted at "+i+1);
                }
            }

        }catch(SQLException e){
            e.getMessage();

        }
    }
}
