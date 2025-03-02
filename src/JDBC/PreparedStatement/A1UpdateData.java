package JDBC.PreparedStatement;
import java.sql.*;

public class A1UpdateData {
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
            String query = "INSERT INTO student(id,name,age,marks) VALUES (?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);

            preparedStatement.setInt(1, 107);
            preparedStatement.setString(2, "Ash");
            preparedStatement.setInt(3, 19);
            preparedStatement.setDouble(4, 81.5);

            int rowsAffected = preparedStatement.executeUpdate();

            if(rowsAffected>0){
                System.out.println("Data Inserted Successfully");
            }
            else{
                System.out.println("Data Not Inserted!!");
            }

        }catch(SQLException e){
            e.getMessage();
        }
    }
}
