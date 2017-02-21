/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAO {
    private static final String CONECTION_STRING_PREFIX ="jbdc:msql";
    private static final String DATABASE = "assignment";
    private static final String DATABASE_USER = "?user=root";
    private static final String DATABASE_PASSWORD = "";
    private static final String HOST_WITH_PORT ="//localhost:3306/";
    
 public static Connection getConnection() throws SQLException{
        String connectionString = CONECTION_STRING_PREFIX + HOST_WITH_PORT + DATABASE + DATABASE_USER + DATABASE_PASSWORD;        
        Connection conn = DriverManager.getConnection(connectionString);            
        return conn;    
}
}
