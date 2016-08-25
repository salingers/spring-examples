package onlyfun.caterpillar.model;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;

public class SimpleMail {
    private String smtpHost;
    private String from;
    
    public void sendPasswdMail(String email, 
            String username, String passwd) {
        JavaMailSenderImpl senderImpl = new JavaMailSenderImpl();
        senderImpl.setHost(getSmtpHost()); 
        
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        
        mailMessage.setTo(email);
        mailMessage.setFrom(getFrom());
        mailMessage.setSubject("您的密碼");
        mailMessage.setText(username + " 您好，您的密碼是 " + passwd);
        
        senderImpl.send(mailMessage);
    }
    
    public void setSmtpHost(String smtpHost) {
        this.smtpHost = smtpHost;
    }
    
    public String getSmtpHost() {
        return smtpHost;
    }
    
    public void setFrom(String from) {
        this.from = from;
    }
    
    public String getFrom() {
        return from;
    }    
}
