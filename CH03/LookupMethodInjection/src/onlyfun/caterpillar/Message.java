package onlyfun.caterpillar;

import java.util.Date;

public class Message {
    private String sysMessage;
    
    public Message() {
        sysMessage = "�t�θ�T�G" + new Date().toString();
    }
    
    public String toString() {
        return sysMessage;
    }
}
