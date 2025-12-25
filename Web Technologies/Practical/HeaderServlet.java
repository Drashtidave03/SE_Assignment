import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;

public class HeaderServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        response.setHeader("Institute", "TOPS Technologies");
        PrintWriter out = response.getWriter();

        Enumeration<String> headers = request.getHeaderNames();
        while(headers.hasMoreElements()) {
            String h = headers.nextElement();
            out.println(h + " : " + request.getHeader(h) + "<br>");
        }
    }
}