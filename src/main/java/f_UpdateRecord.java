import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class f_UpdateRecord {
    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:sqlite:student.db");
        String sql = "UPDATE student SET name = ? WHERE usn = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, "qwe");
        preparedStatement.setString(2, "123");

        preparedStatement.execute();

        connection.close();
    }
}
