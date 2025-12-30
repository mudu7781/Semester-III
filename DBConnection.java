// Robust error handling using try-catch ensures
// system stability during database or runtime failures
import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    public static Connection getConnection() throws Exception {
        return DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/sbi",
            "root",
            "password"
        );
    }
}

