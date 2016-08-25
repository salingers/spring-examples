package onlyfun.caterpillar;

import org.springframework.web.servlet.
                                mvc.SimpleFormController; 
import org.springframework.web.servlet.*;
import java.util.*;
import javax.servlet.http.HttpServletRequest;
import org.springframework.validation.BindException;
import org.springframework.web.
                            bind.ServletRequestDataBinder;

public class WeekFormController extends SimpleFormController {
    private Map refData;
    
    public WeekFormController() {
        setCommandClass(WeekForm.class); 
        
        refData = new HashMap();
        
        List list = new ArrayList();
        for(int i = 0; i < 7; i++) {
            list.add(String.valueOf(i));
        }
        
        refData.put("weekNumbers", list);        
    }

    protected ModelAndView onSubmit(Object command,
                   BindException errors) throws Exception { 
       WeekForm form = (WeekForm) command; 
        
       if(form.getWeekNumber() == null) {
          return new ModelAndView(this.getFormView()); 
       } 
       else { 
          return new ModelAndView(
                  this.getSuccessView(), errors.getModel()); 
       } 
    }

    protected Map referenceData(
           HttpServletRequest request) throws Exception { 
        return refData;
    }
    
    protected void initBinder(HttpServletRequest request, 
              ServletRequestDataBinder binder) throws Exception {
        super.initBinder(request, binder); 
        binder.registerCustomEditor(
                String.class, new WeekPropertyEditor());
    }
}
