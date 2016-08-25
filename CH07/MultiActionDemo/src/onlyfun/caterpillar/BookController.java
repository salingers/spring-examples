package onlyfun.caterpillar; 

import javax.servlet.http.*; 
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.
                 multiaction.MultiActionController;


public class BookController extends MultiActionController { 
    private String testPage; 
    
    public ModelAndView list(HttpServletRequest req, 
                          HttpServletResponse res) { 
        return new ModelAndView(
                        this.getTestPage(),"executed", "list"); 
    } 
    
    public ModelAndView add(HttpServletRequest req, 
                           HttpServletResponse res) { 
        return new ModelAndView(
                        this.getTestPage(),"executed", "add"); 
    } 
    
    public ModelAndView delete(HttpServletRequest req, 
                             HttpServletResponse res) { 
        return new ModelAndView(
                       this.getTestPage(),"executed", "delete"); 
    } 
    
    public String getTestPage() { 
        return testPage; 
    } 
    
    public void setTestPage(String testPage) { 
        this.testPage = testPage; 
    } 
}