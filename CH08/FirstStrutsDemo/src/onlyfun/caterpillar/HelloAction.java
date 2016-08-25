package onlyfun.caterpillar;

import java.util.*;
import javax.servlet.http.*;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class HelloAction extends Action {
    public ActionForward execute(ActionMapping mapping, 
                                   ActionForm form, 
                                   HttpServletRequest request, 
                                   HttpServletResponse response) 
                                                  throws Exception {
        String username = request.getParameter("user");

        Map model = new HashMap();
        
        if(username != null) {
            model.put("username", username);
        }
        else {
            model.put("username", "nobody");
        }

        request.setAttribute("userInfo", model);

        return mapping.findForward("helloUser");
    }
}
