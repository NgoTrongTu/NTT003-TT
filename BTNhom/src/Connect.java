
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {

   public static Connection openConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        
        String url = "jdbc:sqlserver://localhost:1433;databaseName=quanlybansach";
        String username = "sa";
        String password = "123";
        Connection con = DriverManager.getConnection(url, username, password);
        return con;
    }
}
