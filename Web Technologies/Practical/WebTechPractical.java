import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class WebTechPractical extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><head><title>Module 8</title>");
        out.println("<style>");
        out.println("#header{background:lightblue;padding:10px;}");
        out.println(".menu a{margin:10px;text-decoration:none;}");
        out.println(".menu a:hover{color:red;}");
        out.println("input:focus{background:lightyellow;}");
        out.println("</style></head><body>");

        out.println("<div id='header'><h2>Web Technologies</h2></div>");
        out.println("<div class='menu'><a href='#'>Home</a><a href='#'>About</a></div>");

        out.println("<h3>Form</h3>");
        out.println("<form method='post'>");
        out.println("Name:<input type='text' name='name'><br><br>");
        out.println("Email:<input type='email' name='email'><br><br>");
        out.println("<input type='submit'>");
        out.println("</form></body></html>");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<table border='1'><tr><th>Name</th><th>Email</th></tr>");
        out.println("<tr><td>" + request.getParameter("name") +
                    "</td><td>" + request.getParameter("email") + "</td></tr>");
        out.println("</table></body></html>");
    }
}