package database;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectDataSource {
    public static void main(String[] args) {
        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setServerName("morfeusz.wszib.edu.pl");
        ds.setUser("rsamek");
        ds.setPassword("***");
        ds.setPortNumber(1433);
        ds.setDatabaseName("rsamek");
        ds.setTrustServerCertificate(true);

        String sql = "select * from Forum.Topics";

        try(Connection con = ds.getConnection(); Statement stmt = con.createStatement()) {
            ResultSet rs = stmt.executeQuery(sql);

            String topicBody;
            int id;

            while (rs.next()) {
                if ((topicBody = rs.getString("TopicBody")) != null) {
                    id = rs.getInt("ID");
                    System.out.println(id + " - " + topicBody);
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
