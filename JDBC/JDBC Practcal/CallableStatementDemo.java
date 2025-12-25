import java.sql.*;
public class CallableStatementDemo {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb","root","password");
            CallableStatement cs =
                con.prepareCall("{call getFullName(?,?)}");
            cs.setInt(1,1);
            cs.registerOutParameter(2,Types.VARCHAR);
            cs.execute();
            System.out.println("Full Name: "+cs.getString(2));
            con.close();
        } catch(Exception e){ e.printStackTrace(); }
    }
}
