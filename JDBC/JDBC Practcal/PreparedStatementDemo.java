import java.sql.*;
public class PreparedStatementDemo {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb","root","password");
            PreparedStatement ps =
                con.prepareStatement("INSERT INTO student VALUES (?,?,?)");
            ps.setInt(1,2);
            ps.setString(2,"Riya");
            ps.setString(3,"Mehta");
            ps.executeUpdate();
            System.out.println("Record Inserted");
            con.close();
        } catch(Exception e){ e.printStackTrace(); }
    }
}
