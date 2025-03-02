package JDBC.Statement;

import JDBC.Table.Table;

import java.sql.*;

public class A1DataBasePrint {
    private static final String url = "jdbc:mysql://127.0.0.1:3306/jdbc";
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
        Statement statement = connection.createStatement();
        String query = "SELECT * FROM student";
        ResultSet resultSet = statement.executeQuery(query);

//        TableHeader.print(13,"id",13,"age",13,"name",13,"marks");
//
//        while(resultSet.next()){
//            Integer id = resultSet.getInt("id");
//            String name = resultSet.getString("name");
//            Integer age = resultSet.getInt("age");
//            Double marks = resultSet.getDouble("marks");
//            Table.print(13,id,13,age,13,name,13,marks);
//        }
//        TableLiner.print(13, 13, 13, 13);
        Table.Print(connection, "student", resultSet);

        } catch (SQLException e) {
           e.getMessage();
        }

    }
}