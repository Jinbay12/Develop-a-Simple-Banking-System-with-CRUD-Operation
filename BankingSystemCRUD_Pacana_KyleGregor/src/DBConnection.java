import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    // Database credentials - matched perfectly to your schema
    private static final String URL = "jdbc:mysql://localhost:3306/banking_db";
    private static final String USER = "root"; 
    private static final String PASSWORD = "bardlover";

    public static Connection getConnection() throws SQLException {
        try {
            // Load the MySQL Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println("MySQL Driver not found: " + e.getMessage());
        }
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    // Test connection method
    public static void main(String[] args) {
        try (Connection testConn = getConnection()) {
            if (testConn != null) {
                System.out.println("Database Connected Successfully!");
            } else {
                System.out.println("Failed to make connection!");
            }
        } catch (SQLException e) {
            System.out.println("Connection Failed: " + e.getMessage());
        }
    }
}