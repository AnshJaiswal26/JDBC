package JDBC.Table;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TableFunctions {

    public static List<String> findAllCol(Connection c, String table_name){
        List<String> list = new ArrayList<>();

        try {
            String query = "DESCRIBE "+table_name;
            PreparedStatement preparedStatement = c.prepareStatement(query);

            ResultSet rst = preparedStatement.executeQuery();

            while (rst.next()){
                String ColLabel = rst.getString("Field");
                list.add(ColLabel);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
