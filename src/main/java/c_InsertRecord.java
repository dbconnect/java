import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class c_InsertRecord {
    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:sqlite:student.db");
        Statement statement = connection.createStatement();

        String sql = String.format("INSERT INTO student values('%s', '%s')", "123", "abc");
        statement.execute(sql);
        connection.close();
    }
}
