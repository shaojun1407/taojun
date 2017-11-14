package stuinfo;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
 
public class JDBCUtils {
 
    /**
     * @param args
     * @throws SQLException
     */
    public static Connection getconnection() throws SQLException {
 
        try {
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/shao", "mxning", "mxning");
 
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }
    public static void release(ResultSet rs,PreparedStatement ps,Connection con) {
	}
}