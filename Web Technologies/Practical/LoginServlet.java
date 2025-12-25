import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws IOException, ServletException {

        String u = req.getParameter("user");
        String p = req.getParameter("pass");

        RequestDispatcher rd;
        if(u.equals("admin") && p.equals("123")) {
            rd = req.getRequestDispatcher("success");
            rd.forward(req, res);
        } else {
            rd = req.getRequestDispatcher("error");
            rd.include(req, res);
        }
    }
}