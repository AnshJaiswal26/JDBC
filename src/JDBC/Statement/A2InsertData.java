package JDBC.Statement;
import java.sql.*;

public class A2InsertData {
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
            String query = String.format("INSERT INTO student (id, name, age, marks) VALUES (%d, '%s', %d, %f )",106, "Rock", 18, 73.0);
            int rowsAffected = statement.executeUpdate(query);

            if(rowsAffected>0){
                System.out.println("Data inserted successfully");
            }

        } catch (SQLException e) {
           System.out.println(e.getMessage());
        }

    }
}