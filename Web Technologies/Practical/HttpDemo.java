import java.io.*;
import javax.servlet.http.*;

public class HttpDemo extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws IOException {
        res.getWriter().println("Http Servlet");
    }
}