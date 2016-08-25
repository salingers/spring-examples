package onlyfun.caterpillar;

import org.springframework.mail.javamail.JavaMailSenderImpl;
import javax.mail.internet.MimeMessage;
import org.springframework.core.io.ClassPathResource;
import org.springframework.mail.javamail.MimeMessageHelper;

public class AttachedImageDemo {
    public static void main(String[] args) throws Exception {
        JavaMailSenderImpl senderImpl = 
                    new JavaMailSenderImpl();
        
        // 設定 Mail Server
        senderImpl.setHost("your_mail_server.com"); 
        
        // 建立郵件訊息
        MimeMessage mailMessage = 
            senderImpl.createMimeMessage();
        MimeMessageHelper messageHelper = 
            new MimeMessageHelper(mailMessage, true);
                
        // 設定收件人、寄件人、主題與內文
        messageHelper.setTo("xxx@your_mail_server.com");
        messageHelper.setFrom("xxx@your_mail_server.com");
        messageHelper.setSubject("Test");
        messageHelper.setText(
            "<html><head></head><body><h1>Hello! Spring!"
            + "</h1><img src=\"cid:caterpillar\">" 
            + "</body></html>", true);
        
        ClassPathResource img = 
                new ClassPathResource("caterpillar.jpg");
        messageHelper.addInline("wish", img);
        
        // 傳送郵件
        senderImpl.send(mailMessage); 
        
        System.out.println("郵件傳送成功...");
    }
} 
