package day8;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC3 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("Driver Loaded");
        Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/acharya", "root", "faris");
        System.out.println("Connection Established...");
        Statement stmt = con.createStatement();
        String sql = "insert into faris values(101,'faris',20)";// insert values into table
        System.out.println("inserted statement");
        stmt.execute(sql);
        System.out.println("process the data return by database");
        con.close();
    }
}
