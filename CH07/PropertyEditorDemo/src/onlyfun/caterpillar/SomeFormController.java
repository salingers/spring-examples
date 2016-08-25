package onlyfun.caterpillar;

import org.springframework.web.servlet.
                        mvc.SimpleFormController; 
import org.springframework.web.servlet.*;
import java.util.*;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.
                        bind.ServletRequestDataBinder;

public class SomeFormController extends SimpleFormController {
    public SomeFormController() {
        setCommandClass(SomeForm.class);  
    }

    protected ModelAndView onSubmit(
                      Object command) throws Exception { 
       SomeForm form = (SomeForm) command;
       
       Map model = new HashMap();
       model.put("firstName", 
                 form.getUser().getFirstName()); 
       model.put("lastName", 
                 form.getUser().getLastName());
       
       return new ModelAndView(this.getSuccessView(), model);
    }
    
    protected void initBinder(HttpServletRequest request, 
                          ServletRequestDataBinder binder) 
                                           throws Exception {
        super.initBinder(request, binder); 
        binder.registerCustomEditor(
                User.class, new UserPropertyEditor());
    }
}
