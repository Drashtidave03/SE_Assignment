import java.sql.*;
public class StatementCrudDemo {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb","root","password");
            Statement stmt = con.createStatement();
            stmt.executeUpdate("INSERT INTO student VALUES (1,'Amit','Patel')");
            stmt.executeUpdate("UPDATE student SET lname='Shah' WHERE id=1");
            ResultSet rs = stmt.executeQuery("SELECT * FROM student");
            while(rs.next())
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
            stmt.executeUpdate("DELETE FROM student WHERE id=1");
            con.close();
        } catch(Exception e){ e.printStackTrace(); }
    }
}
