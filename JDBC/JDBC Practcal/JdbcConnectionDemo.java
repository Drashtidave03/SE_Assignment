import java.sql.*;
public class JdbcConnectionDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb","root","password");
            System.out.println("Database Connected Successfully");
            con.close();
        } catch (Exception e) { e.printStackTrace(); }
    }
}
