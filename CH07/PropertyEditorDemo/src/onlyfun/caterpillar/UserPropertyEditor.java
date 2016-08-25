package onlyfun.caterpillar;

import java.beans.PropertyEditorSupport;

public class UserPropertyEditor extends PropertyEditorSupport {
    public String getAsText() {
        Object o = this.getValue();
        
        if(o == null || !(o instanceof User)) {
            return null;
        }
        
        User user = (User) o;       
        String name = user.getFirstName() 
                       + "," + user.getLastName();       
        return name;
    }
    
    public void setAsText(String text) {
        String[] tokens = text.split(",");
        
        User user = new User();
        user.setFirstName(tokens[0]);
        user.setLastName(tokens[1]);
        
        setValue(user);
    }
}