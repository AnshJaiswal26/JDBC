package JDBC.Statement;

import java.sql.*;

public class practice {
    private static final String url = "jdbc:mysql://127.0.0.1:3306/jdbc2";

    private static final String user = "root";

    private static final String password = "Ansh@2004";

    public static void main(String[] args){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

        try{
            Connection connection = DriverManager.getConnection(url,user,password);
            Statement statement = connection.createStatement();
//            String query = String.format("INSERT INTO student (id, name, age, marks) VALUES (%d,'%s',%d,%f)", 104, "Joy", 19, 93.56 );
            String query = "SELECT * FROM student";
            ResultSet resultSet = statement.executeQuery(query);

//            TableHeader.print(7,"id",7,"age",8,"name",8,"marks");
//            while(resultSet.next()){
//               Integer id = resultSet.getInt("id");
//               Integer age = resultSet.getInt("age");
//               String name = resultSet.getString("name");
//               Double marks = resultSet.getDouble("marks");
//               Table.print(7,id,7,age,8,name,8,marks);
//            }
//            TableLiner.print(7, 7, 8, 8);

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
