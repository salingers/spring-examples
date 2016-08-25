package onlyfun.caterpillar;

import java.util.Date;

public class Message {
    private String sysMessage;
    
    public Message() {
        sysMessage = "系統資訊：" + new Date().toString();
    }
    
    public String toString() {
        return sysMessage;
    }
}
