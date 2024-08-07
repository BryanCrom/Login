/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bryan.login;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author bryan
 */
public final class Database {
    
    private static Connection conn;
    private static final String URL = "jdbc:derby:AccountsDB; create=true";
    private static final String USERNAME = "LoginUsername";
    private static final String PASSWORD = "LoginPassword";
    
    public Database(){
        establishConnection();
    }
    
    public void establishConnection(){
        if(conn == null){
            try{
                conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
                System.out.println(URL + " connected...");
            }
            catch(SQLException e){
                System.err.println("SQLException: " + e.getMessage());
            }
        }
    }
    
    public void closeConnection(){
        if(conn != null){
            try{
                conn.close();
            }
            catch(SQLException e){
                System.err.println("SQLException: " + e.getMessage());
            }
        }
    }
    
    public boolean checkTableExsisting(String tableName){
        boolean tableExists = false;
        try{
            DatabaseMetaData dbmd = conn.getMetaData();
            ResultSet rs = dbmd.getTables(null, null, tableName, null);
            tableExists = rs.next();
        }
        catch(SQLException e){
            System.err.println("SQLException: " + e.getMessage());
        }
        return tableExists;
    }
    
    
}
