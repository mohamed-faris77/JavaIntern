
import java.sql.*;
import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/acharya", "root", "faris");
        while (true) {
            Scanner scan = new Scanner(System.in);

            System.out.println("enter your id :");
            int id = scan.nextInt();
            System.out.println("enter your name :");
            String name = scan.next();
            System.out.println("enter your age :");
            int age = scan.nextInt();

            String sql = "insert faris values(?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setInt(3, age);
            int i = ps.executeUpdate();
            if (i > 0) {
                System.out.println("inserted successfully");
                System.out.println("dou you want to continue yes or no?");
                String option = scan.next();
                if (option.equalsIgnoreCase("no")) {
                    break;
                }

            } else {
                System.out.println("inserted unsuccessfully");
            }
        }
        con.close();

    }
}
