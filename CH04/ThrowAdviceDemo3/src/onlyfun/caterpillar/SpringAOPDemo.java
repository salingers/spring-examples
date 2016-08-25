package onlyfun.caterpillar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.
              support.ClassPathXmlApplicationContext;

public class SpringAOPDemo {
    public static void main(String[] args) {
        ApplicationContext context = 
                new ClassPathXmlApplicationContext(
                        "beans-config.xml"); 
        IHello helloSpeaker = 
            (IHello) context.getBean("helloSpeaker"); 
        
        try { 
            helloSpeaker.hello("Justin"); 
        } 
        catch(Throwable throwable) { 
            // 應用程式的例外處理
            System.err.println(throwable);
        } 
    }
}