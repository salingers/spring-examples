package onlyfun.caterpillar.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import onlyfun.caterpillar.model.IUserDAO;
import onlyfun.caterpillar.model.User;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.
                               mvc.SimpleFormController;

public class LoginController extends SimpleFormController {
    private IUserDAO userDAO;
    
    public LoginController() {
        this.setCommandClass(LoginForm.class);
    }
    
    protected ModelAndView onSubmit(HttpServletRequest request, 
                           HttpServletResponse response, 
                           Object command, 
                           BindException exception) 
                                            throws Exception {
        LoginForm form = (LoginForm) command;
        
        User user = userDAO.findByName(form.getUsername());

        if(user == null) {
            exception.rejectValue("username", 
                    "no_such_user", "查無此人");
            return new ModelAndView(
                    this.getFormView(), exception.getModel());
        }
        else if(user != null && 
                !user.getPasswd().equals(form.getPasswd())) {
            exception.rejectValue("passwd", 
                    "wrong_passwd", "密碼錯誤");
            return new ModelAndView(
                    this.getFormView(), exception.getModel());
        }        
        else {
            request.getSession().setAttribute(
                    "valid_user", user.getUsername());
            return new ModelAndView(this.getSuccessView());
        }
    } 
    
    public void setUserDAO(IUserDAO userDAO) {
        this.userDAO = userDAO;
    }
    
    public IUserDAO getUserDAO() {
        return userDAO;
    }
}
