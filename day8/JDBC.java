/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day8;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author FARIS
 */
public class JDBC {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("Driver Loaded");
        Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/acharya", "root", "faris");// connecting a database with java 
        System.out.println("Connection Established...");
    }
    
}
