package onlyfun.caterpillar; 

import org.springframework.web.servlet.
                          mvc.SimpleFormController; 
import org.springframework.web.servlet.*; 

public class LoginController extends SimpleFormController {
    public LoginController() {
        setCommandClass(LoginForm.class); 
    }

    protected ModelAndView onSubmit(
                Object command) throws Exception { 
       LoginForm form = (LoginForm) command; 

       if("caterpillar".equals(form.getUsername()) && 
          "123456".equals(form.getPassword())) { 
          return new ModelAndView(
                  getSuccessView(),"user", form.getUsername()); 
       } 
       else { 
           return new ModelAndView(getFormView()); 
       } 
    } 
}
