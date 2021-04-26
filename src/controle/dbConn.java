
package controle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author aimab
 */
public class dbConn {
        
    // Declaration des objets
            private static Connection conn = null;
			
        static{
	try {
                            Class.forName("com.mysql.jdbc.Driver");
                            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/note","root","");
           
                        } catch (ClassNotFoundException | SQLException e) {
                            JOptionPane.showMessageDialog(null, e);
                            //System.out.println("Database.getConnection() Error --> " + e.getMessage());
                        } 
                }
			
	//=====
	public static Connection getConnection(){
                        return conn;
	}
    
}
