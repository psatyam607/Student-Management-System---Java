import java.sql.*;
public class DbUtils {
    
    public static Connection connect() throws Exception {
        
        final String url="jdbc:mysql://localhost/collgedb";
        Connection con=DriverManager.getConnection(url, "root", "anand");
        return con;
        
    }
    
}
