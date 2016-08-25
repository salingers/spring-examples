package onlyfun.caterpillar; 

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.
                      ClassPathXmlApplicationContext; 

public class SpringDemo { 
    public static void main(String[] args) { 
        ApplicationContext context = 
            new ClassPathXmlApplicationContext(
                    "beans-config.xml");
        MessageManager messageManager = 
            (MessageManager) context.getBean("messageManager");
        
        try {
            messageManager.display();
            Thread.sleep(1000);
            messageManager.display();
            Thread.sleep(1000);
            messageManager.display();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }       
    } 
}
