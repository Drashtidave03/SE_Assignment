import java.sql.*;
public class ResultSetDemo {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb","root","password");
            Statement stmt = con.createStatement(
                ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = stmt.executeQuery("SELECT * FROM student");
            rs.first();
            System.out.println("First: "+rs.getString(2));
            rs.last();
            System.out.println("Last: "+rs.getString(2));
            con.close();
        } catch(Exception e){ e.printStackTrace(); }
    }
}
