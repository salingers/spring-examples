package onlyfun.caterpillar.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import onlyfun.caterpillar.model.IUserDAO;
import onlyfun.caterpillar.model.User;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

public class RegisterController extends SimpleFormController {
    private IUserDAO userDAO;
    
    public RegisterController() {
        setCommandClass(RegisterForm.class); 
    }
    
    protected ModelAndView onSubmit(HttpServletRequest request, 
                                  HttpServletResponse response, 
                                  Object command, 
                                  BindException exception) throws Exception {
        RegisterForm form = (RegisterForm) command;
        
        User user = new User();
        
        user.setEmail(form.getEmail());
        user.setUsername(form.getUsername());
        user.setPasswd(form.getPasswd());
        
        this.getUserDAO().insert(user);
        request.getSession().setAttribute("valid_user", form.getUsername());
        
        return new ModelAndView(this.getSuccessView());
    }
    
    public void setUserDAO(IUserDAO userDAO) {
        this.userDAO = userDAO;
    }
    
    public IUserDAO getUserDAO() {
        return userDAO;
    }
}
