package proteger;


import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User1
 */
public class databaseConnection {
    
   // C:\Program Files\Java\jdk1.8.0_171\jre\lib\ext
    final static String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    final static String DB_URL = "jdbc:mysql://192.168.1.120:3306/kanishka";
    
    final static String USER = "kanishka";
    final static String PASS ="kanishka#321";
    
    public static Connection connection(){
        
        try {
            Class.forName(JDBC_DRIVER);
            
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            return conn;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
            return null;
    }
}
