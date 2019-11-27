package Database;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBhandler {
    private  String username = "";
    private  String password = "";
    private  String path ="jdbc:mysql://localhost/";

    public DBhandler getConnection(){
        Connection con = null;
        try {
            con = DriverManager.getConnection("path","username", "password");
            JOptionPane.showMessageDialog(null,"Database connected");
        } catch (SQLException ex) {
            Logger.getLogger(DBhandler.class.getName()).log(Level.SEVERE, JOptionPane.showInputDialog(null,"Can not connect"), ex);
        }
        return null;
    }

}
