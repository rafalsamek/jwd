package database;

import java.sql.DriverManager;
import java.sql.SQLException;

public class MyFirstJdbcConnection {
    public static void main(String[] args) {
        String connectionUrl = "jdbc:sqlserver://localhost;encrypt=true;user=MyUserName;password=*****;";

        try {
            DriverManager.getConnection(connectionUrl);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
