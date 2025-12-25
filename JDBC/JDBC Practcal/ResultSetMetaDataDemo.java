import java.sql.*;
public class ResultSetMetaDataDemo {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb","root","password");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM student");
            ResultSetMetaData rsmd = rs.getMetaData();
            for(int i=1;i<=rsmd.getColumnCount();i++)
                System.out.println(rsmd.getColumnName(i)+" "+rsmd.getColumnTypeName(i));
            con.close();
        } catch(Exception e){ e.printStackTrace(); }
    }
}
