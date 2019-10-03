import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class b_CreateTable {
    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:sqlite:student.db");
        Statement statement = connection.createStatement();

        String sql = "CREATE TABLE student (usn text, name text)";
        statement.execute(sql);
        connection.close();
    }
}
