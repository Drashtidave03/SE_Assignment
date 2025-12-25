import javax.servlet.*;

public class AppListener implements ServletContextListener {
    public void contextInitialized(ServletContextEvent e) {
        System.out.println("App Started");
    }
    public void contextDestroyed(ServletContextEvent e) {
        System.out.println("App Stopped");
    }
}