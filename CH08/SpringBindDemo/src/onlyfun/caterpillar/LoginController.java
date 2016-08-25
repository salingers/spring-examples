package onlyfun.caterpillar; 

import org.springframework.validation.BindException; 
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.mvc.SimpleFormController; 
import org.springframework.web.servlet.*; 

public class LoginController extends SimpleFormController { 
    public LoginController() {
        setCommandClass(LoginForm.class);
    }

    protected ModelAndView onSubmit(Object command,  
                                  BindException errors) 
                                       throws Exception {  
       LoginForm form = (LoginForm) command; 
        
       if("caterpillar".equals(form.getUsername()) && 
             "123456".equals(form.getPassword())) { 
          return new ModelAndView(getSuccessView(),"user", 
                                  form.getUsername()); 
       } 
       else { 
            // ��^Form�����ɡA�n���@��errors��Model���
            errors.reject("loginfail", "�ϥΪ̦W�٩αK�X���~"); 
          return new ModelAndView(getFormView(), 
                                  errors.getModel()); 
       } 
    } 
}
