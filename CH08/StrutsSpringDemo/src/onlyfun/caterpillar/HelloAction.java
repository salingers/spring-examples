package onlyfun.caterpillar;

import java.util.*;
import javax.servlet.http.*;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class HelloAction extends Action {
    private UserChecker userChecker;
    
    public ActionForward execute(
                             ActionMapping mapping, 
                             ActionForm form, 
                             HttpServletRequest request, 
                             HttpServletResponse response) 
                                  throws Exception {
        String username = request.getParameter("user");
        username = this.getUserChecker().check(username);
        
        Map model = new HashMap();
        model.put("username", username);
        request.setAttribute("userInfo", model);

        return mapping.findForward("helloUser");
    }
    
    public UserChecker getUserChecker() {
        return userChecker;
    }
    
    public void setUserChecker(UserChecker userChecker) {
        this.userChecker = userChecker;
    }
}
