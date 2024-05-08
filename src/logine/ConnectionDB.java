package logine;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging. Logger;
import javax.swing. JOptionPane;


public class ConnectionDB {
   public static Connection getConnection(){
       Connection Connection = null;
        try {
            Connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/users","root","");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Connection Failed");
        }
        return Connection ;
    }
}