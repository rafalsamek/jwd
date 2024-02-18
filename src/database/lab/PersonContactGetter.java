package database.lab;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.sql.*;

/**
 * Napisz program, który korzystając z bazy danych AdventureWorks wyświetli podstawowe dane 10. pierwszych osób 
 * (Person.Contact), którzy mają na nazwisko „Anderson”.
 * Dokonaj modyfikacji powyższego programu, aby można było wyszukiwać osoby podając początek nazwiska.
 */
public class PersonContactGetter {
    private static final String DB_HOST = "morfeusz.wszib.edu.pl";
    private static final int DB_PORT = 1433;
    private static final String DB_USER = "rsamek";
    private static final String DB_PASS = "***";
    private static final String DB_NAME = "AdventureWorks";

    private static final String SELECT_10_TOP_PERSONS_SQL = "SELECT * FROM Person.Contact";
    private static final String SELECT_PERSONS_BY_LASTNAME_SQL = "SELECT * FROM Person.Contact WHERE Lastname LIKE ?";

    public static void main(String[] args) throws SQLException {
        if (args.length < 1) {
            System.out.println("Nie podano początku nazwiska");
            System.exit(-1);
        }
        PersonContactGetter personContactGetter = new PersonContactGetter();
        ResultSet rs = null;
        try(Connection con = personContactGetter.connect(DB_USER, DB_PASS, DB_NAME);
            Statement stmt = con.createStatement()) {
//                ResultSet rs = stmt.executeQuery(SELECT_10_TOP_PERSONS_SQL);

                PreparedStatement ps = con.prepareStatement(SELECT_PERSONS_BY_LASTNAME_SQL);

                ps.setString(1, args[0] + "%");
                rs = ps.executeQuery();

                while (rs.next()) {
                    System.out.println(rs.getString("FirstName") + " " + rs.getString("LastName"));
                }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                rs.close();
            }
        }
    }

    public Connection connect(String username, String password, String dbName) throws SQLServerException {
        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setTrustServerCertificate(true);
        ds.setDatabaseName(dbName);
        ds.setUser(username);
        ds.setPassword(password);
        ds.setPortNumber(DB_PORT);
        ds.setServerName(DB_HOST);

        return ds.getConnection();
    }
}
