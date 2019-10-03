import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class a_ConnectToDb {
    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:sqlite:student.db");
        connection.close();
    }
}
