package sqlInjection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MainDriver {
	
	public Connection db_connect(){
		Connection conn = null;
		
		try {
		    conn =
		       DriverManager.getConnection("jdbc:mysql://localhost/test?" +
		                                   "user=minty&password=greatsqldb");

		    // Do something with the Connection

		  
		} catch (SQLException ex) {
		    // handle any errors
		    System.out.println("SQLException: " + ex.getMessage());
		    System.out.println("SQLState: " + ex.getSQLState());
		    System.out.println("VendorError: " + ex.getErrorCode());
		}
		return conn;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try {
            // The newInstance() call is a work around for some
            // broken Java implementations

            Class.forName("com.mysql.jdbc.Driver").newInstance();
        } catch (Exception ex) {
            // handle the error
        }
    }



}
	



