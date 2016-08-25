package onlyfun.caterpillar;

import java.beans.PropertyEditorSupport;

public class UserEditor extends PropertyEditorSupport {
    public void setAsText(String text) {
        String[] strs = text.split(",");
        int number = Integer.parseInt(strs[1]);
        
        User user = new User();
        user.setName(strs[0]);
        user.setNumber(number);
        
        setValue(user);
    }
}