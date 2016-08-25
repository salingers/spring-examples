package onlyfun.caterpillar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.mvc.Controller; 
import org.springframework.web.servlet.ModelAndView; 

public class HelloController implements Controller {
    private String viewPage;
    
    public ModelAndView handleRequest(HttpServletRequest req, 
                                    HttpServletResponse res) 
                                       throws Exception {
        String user = req.getParameter("user");
        Integer age = new Integer(
                Integer.parseInt(req.getParameter("age")));
        
        java.util.Map model = new java.util.HashMap();
        model.put("name", user);
        model.put("age", age);
        
        return new ModelAndView(viewPage, model);
    }
    
    public void setViewPage(String viewPage) {
        this.viewPage = viewPage;
    }
}
