/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author HP
 */
public class databaseConnector {
    public static Connection getConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ems","root", "123");
            return con;
        } catch (Exception e) {
            System.err.println("Connection Error"+ e);
            return null;
        }
    }
    
    public static void close(Connection con) {
          try  {
              con.close();
          }
          catch(Exception ex) {
          }
      }
    
}
