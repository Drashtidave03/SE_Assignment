import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LifeCycleServlet extends HttpServlet {
    public void init() { System.out.println("Init"); }
    public void doGet(HttpServletRequest req, HttpServletResponse res)
            throws IOException {
        res.getWriter().println("Service Called");
    }
    public void destroy() { System.out.println("Destroy"); }
}