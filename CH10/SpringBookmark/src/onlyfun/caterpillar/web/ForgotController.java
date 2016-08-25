package onlyfun.caterpillar.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import onlyfun.caterpillar.model.IUserDAO;
import onlyfun.caterpillar.model.SimpleMail;
import onlyfun.caterpillar.model.User;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.
                              mvc.AbstractController;

public class ForgotController extends AbstractController {
    private IUserDAO userDAO;
    private SimpleMail simpleMail;
    private String loginPage;
    private String forgotPage;
    
    public ModelAndView handleRequestInternal(
                HttpServletRequest request, 
                HttpServletResponse response) throws Exception {
    	String email = request.getParameter("email");
        if(email != null && !"".equals(email)) {
            // �ھڶl���}�d�ߨϥΪ̪����
            User user = getUserDAO().findByEmail(email);
            // ���oSimpleMail��Ҩó]�w������ƥH�o�e�l��
            getSimpleMail().sendPasswdMail(
                    user.getEmail(), 
                    user.getUsername(), 
                    user.getPasswd());
            return new ModelAndView(this.getLoginPage());
        }
        else {
            return new ModelAndView(this.getForgotPage());
        }
    }

    public void setUserDAO(IUserDAO userDAO) {
        this.userDAO = userDAO;
    }
    
    public IUserDAO getUserDAO() {
        return userDAO;
    }        

    public void setSimpleMail(SimpleMail simpleMail) {
        this.simpleMail = simpleMail;
    }
    
    public SimpleMail getSimpleMail() {
        return simpleMail;
    }        

    public void setLoginPage(String loginPage) {
        this.loginPage = loginPage;
    }
    
    public String getLoginPage() {
        return loginPage;
    }
    
    public void setForgotPage(String forgotPage) {
        this.forgotPage = forgotPage;
    }
    
    public String getForgotPage() {
        return forgotPage;
    }
}
