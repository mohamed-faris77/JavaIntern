
package day9;

import java.sql.*;
import java.util.Scanner;


public class Ex1 {
   

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Scanner scan = new Scanner(System.in);
       
         System.out.println("enter your id :");
        int id = scan.nextInt();
         System.out.println("enter your name :");
        String name = scan.next();
         System.out.println("enter your age :");
        int age = scan.nextInt();
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/acharya", "root", "faris");
        String sql="insert faris values(?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1,id);
        ps.setString(2,name);
        ps.setInt(3,age);
        int i = ps.executeUpdate();
        if (i>0)
        {
            System.out.println("Record inserted");
        }
        else
        {
            System.out.println("Record not inserted");
        }
        con.close();
    }
        
    }
