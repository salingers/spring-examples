package onlyfun.caterpillar;
 
import java.io.*; 
import javax.servlet.*; 
import javax.servlet.http.*; 
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.
                                support.WebApplicationContextUtils;
 
public class TimeServlet extends HttpServlet { 
    public void doGet(HttpServletRequest req, 
                    HttpServletResponse res) 
                  throws ServletException, IOException { 
        WebApplicationContext ctx = 
                WebApplicationContextUtils.
                    getRequiredWebApplicationContext(
                        this.getServletContext());
        
        PrintWriter out = res.getWriter(); 
        out.println(ctx.getBean("dateBean")); 
    } 
}
