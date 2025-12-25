import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class SwingCrudDemo extends JFrame {
    JTextField id,fname,lname;
    JButton insert;
    public SwingCrudDemo() {
        id=new JTextField(); fname=new JTextField(); lname=new JTextField();
        insert=new JButton("Insert");
        setLayout(null);
        id.setBounds(50,30,150,25);
        fname.setBounds(50,70,150,25);
        lname.setBounds(50,110,150,25);
        insert.setBounds(50,150,150,30);
        add(id); add(fname); add(lname); add(insert);
        insert.addActionListener(e -> insertData());
        setSize(300,250); setVisible(true);
    }
    void insertData() {
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb","root","password");
            PreparedStatement ps =
                con.prepareStatement("INSERT INTO student VALUES (?,?,?)");
            ps.setInt(1,Integer.parseInt(id.getText()));
            ps.setString(2,fname.getText());
            ps.setString(3,lname.getText());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(this,"Inserted");
            con.close();
        } catch(Exception ex){ ex.printStackTrace(); }
    }
    public static void main(String[] args) { new SwingCrudDemo(); }
}
