package JDBC;

import JDBC.Table.TableData;
import JDBC.Table.TableHeader;
import JDBC.Table.TableLiner;

import java.sql.*;

public class PrintDatabaseTable {
    private static final String url = "jdbc:mysql://127.0.0.1:3306/Transaction";
    private static final String user = "root";
    private static final String password = "Ansh@2004";

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            Connection connection = DriverManager.getConnection(url,user,password);

            String query = "SELECT * FROM Accounts";
            PreparedStatement preparedStatement = connection.prepareStatement(query);

            ResultSet resultSet = preparedStatement.executeQuery();

            TableHeader.print(20,"account_number",25,"account_holder_name",16,"balance_$");
            while(resultSet.next()){
                Integer account_number = resultSet.getInt("account_number");
                String account_holder_name = resultSet.getString("account_holder_name");
                Double balance = resultSet.getDouble("balance_$");
                TableData.print(20,account_number,25,account_holder_name,16,balance);
            }
            TableLiner.print(20, 25, 16);

        } catch (SQLException e) {
            System.out.print(e.getMessage());
        }

    }
}
