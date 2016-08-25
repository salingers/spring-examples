package onlyfun.caterpillar;

import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.SimpleMailMessage;

public class SimpleMailDemo {
    public static void main(String[] args) throws Exception {
        JavaMailSenderImpl senderImpl = new JavaMailSenderImpl();
        // �]�w Mail Server
        senderImpl.setHost("your_mail_server.com"); 
        
        // �إ߶l��T��
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        
        // �]�w����H�B�H��H�B�D�D�P����
        mailMessage.setTo("xxx@your_mail_server.com");
        mailMessage.setFrom("xxx@your_mail_server.com");
        mailMessage.setSubject("Test");
        mailMessage.setText("This is a test!!!");
        
        // �ǰe�l��
        senderImpl.send(mailMessage);
        
        System.out.println("�l��ǰeOK..");
    }
}
