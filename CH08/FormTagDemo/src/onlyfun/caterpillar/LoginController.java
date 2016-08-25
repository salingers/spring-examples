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
            // 返回Form頁面時，要有一個errors的Model實例
            errors.reject("loginfail", "使用者名稱或密碼錯誤"); 
          return new ModelAndView(getFormView(), 
                                  errors.getModel()); 
       } 
    } 
}
