import java.sql.*;

public class d_SelectRecords {
    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:sqlite:student.db");
        String sql = "SELECT * FROM student";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet.next()) {
            System.out.println(resultSet.getString("usn") + " " + resultSet.getString("name"));
        }

        connection.close();
    }
}
