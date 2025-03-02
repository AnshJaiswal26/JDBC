package JDBC.Statement;
import java.sql.*;

public class A3UpdateData {
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
            String query = String.format("UPDATE student SET marks = %f WHERE id = %d",93.0,105);
            int rowsAffected = statement.executeUpdate(query);

            if(rowsAffected>0){
                System.out.println("Data Updated successfully");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
}