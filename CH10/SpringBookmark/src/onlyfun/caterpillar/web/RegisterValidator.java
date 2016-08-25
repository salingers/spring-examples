package onlyfun.caterpillar.web;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class RegisterValidator implements Validator { 
    public boolean supports(Class clazz) { 
        return clazz.equals(RegisterForm.class); 
    } 
    
    public void validate(Object obj, Errors errors) { 
        RegisterForm form = (RegisterForm) obj; 
        
        if(!validateEmail(form.getEmail())) {
            errors.rejectValue("email", 
                    "invalid_email", null, "�l��榡�����T"); 
        }
        
        if(form.getPasswd().length() < 6 || 
          form.getPasswd().length() > 16) { 
            errors.rejectValue("passwd", 
                "less-or-over", null, "�K�X���ץ����O6��16�r��"); 
        } 
        
        if(!form.getPasswd().equals(form.getPasswd2())) { 
            errors.rejectValue(
              "passwd", "not-equal", null, "�⦸��J���K�X����"); 
        }         
    }
    
    private boolean validateEmail(String email) {
        return email.matches("^[_a-z0-9-]+([.]" + 
                "[_a-z0-9-]+)*@[a-z0-9-]+([.][a-z0-9-]+)*$");
    } 
}
