package JDBC.PreparedStatement;

import java.sql.*;

public class A2RetrieveMarks {
    private static final String url = "jdbc:mysql://localhost:3306/jdbc";
    private static final String user = "root";
    private static final String password = "Ansh@2004";

    public static void main(String[] args){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch(ClassNotFoundException e){
            e.getMessage();
        }

        try{
            Connection connection = DriverManager.getConnection(url,user,password);
            String query = "SELECT * FROM student WHERE id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);

            preparedStatement.setInt(1, 103);

//            int rowsAffected = preparedStatement.executeUpdate();
            ResultSet resultSet = preparedStatement.executeQuery();

//            TableHeader.print(8, "id",12, "name", 8, "age", 8, "marks");
//            if(resultSet.next()){
//                Integer id = resultSet.getInt("id");
//                String name = resultSet.getString("name");
//                Integer age = resultSet.getInt("age");
//                Double marks = resultSet.getDouble("marks");
//
//                Table.print(8, id, 12, name, 8, age, 8, marks);
//            }
//            TableLiner.print(8, 12, 8, 8);

        }catch(SQLException e){
            e.getMessage();
        }
    }
}
