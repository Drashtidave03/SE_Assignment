import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ConfigServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws IOException {
        ServletConfig cfg = getServletConfig();
        res.getWriter().println("College: " + cfg.getInitParameter("college"));
    }
}