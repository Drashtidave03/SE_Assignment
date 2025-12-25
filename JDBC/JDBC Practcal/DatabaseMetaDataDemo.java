import java.sql.*;
public class DatabaseMetaDataDemo {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb","root","password");
            DatabaseMetaData dbmd = con.getMetaData();
            System.out.println("DB Name: "+dbmd.getDatabaseProductName());
            System.out.println("DB Version: "+dbmd.getDatabaseProductVersion());
            con.close();
        } catch(Exception e){ e.printStackTrace(); }
    }
}
