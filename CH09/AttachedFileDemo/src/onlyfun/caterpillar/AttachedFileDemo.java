package onlyfun.caterpillar;

import org.springframework.mail.javamail.JavaMailSenderImpl;
import javax.mail.internet.MimeMessage;
import org.springframework.core.io.ClassPathResource;
import org.springframework.mail.javamail.MimeMessageHelper;

public class AttachedFileDemo {
    public static void main(String[] args) throws Exception {
        JavaMailSenderImpl senderImpl = 
                      new JavaMailSenderImpl();
        
        // �]�w Mail Server
        senderImpl.setHost("your_mail_server.com"); 
        
        // �إ߶l��T��
        MimeMessage mailMessage = 
            senderImpl.createMimeMessage();
        MimeMessageHelper messageHelper = 
            new MimeMessageHelper(mailMessage, true);
                
        // �]�w����H�B�H��H�B�D�D�P����
        messageHelper.setTo("xxx@your_mail_server.com");
        messageHelper.setFrom("xxx@your_mail_server.com");
        messageHelper.setSubject("Test");
        messageHelper.setText(
            "<html><head></head><body><h1>Hello! Spring!"
            + "</h1></body></html>", true);
        
        ClassPathResource file = 
                new ClassPathResource("caterpillar.zip");
        messageHelper.addAttachment("caterpillar.zip", file);
        
        // �ǰe�l��
        senderImpl.send(mailMessage); 
        
        System.out.println("�l��ǰe���\...");
    }
} 
