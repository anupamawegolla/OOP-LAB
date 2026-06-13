import java.sql.Connection;
import java.sql.SQLException;

public class StudentConnectionTest {
    public static void main(String[] args) {
        try {
            Connection connection = StudentDatabaseConnection.getConnection();
            System.out.println("Database connected successfully.");
            connection.close(); 
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }
}