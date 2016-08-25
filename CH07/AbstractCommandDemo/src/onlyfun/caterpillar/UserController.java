package onlyfun.caterpillar;

import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.*; 
import org.springframework.web.servlet.ModelAndView; 
import org.springframework.web.servlet.
                     mvc.AbstractCommandController;
import org.springframework.validation.BindException;

public class UserController extends AbstractCommandController {
    private String userPage;
    
    public UserController() {
        setCommandClass(User.class);
    }
    
    protected ModelAndView handle(HttpServletRequest request,
                        HttpServletResponse response,
                        Object command,
                        BindException exception) throws Exception {
        User user = (User) command;
        
        Map model = new HashMap();
        model.put("name", user.getName());
        model.put("password", user.getPassword());

        return new ModelAndView(getUserPage(), "userInfo", model);
    }
    
    public void setUserPage(String userPage) {
        this.userPage = userPage;
    }
    
    public String getUserPage() {
        return userPage;
    } 
}
