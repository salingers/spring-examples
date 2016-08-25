package onlyfun.caterpillar;

import java.util.*;
import javax.servlet.http.*; 
import org.springframework.web.servlet.ModelAndView; 
import org.springframework.web.servlet.
                   mvc.AbstractWizardFormController;
import org.springframework.validation.BindException;

public class WizardController 
                extends AbstractWizardFormController {
    private String successView;
    
    public WizardController() {
        setCommandClass(Questionnaire.class);
    }
    
    protected ModelAndView processFinish(
                          HttpServletRequest request,
                          HttpServletResponse response,
                          Object command,
                         BindException exception) throws Exception {
        Questionnaire questionnaire = (Questionnaire) command; 
        
        Map model = new HashMap();
        model.put("q1", questionnaire.getQuestion1());
        model.put("q2", questionnaire.getQuestion2());
        model.put("q3", questionnaire.getQuestion3());
        
        return new ModelAndView(getSuccessView(), "ans", model);
    }
    
    public void setSuccessView(String successView) {
        this.successView = successView;
    }
    
    public String getSuccessView() {
        return successView;
    }
}
