package onlyfun.caterpillar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.
              support.ClassPathXmlApplicationContext;

public class SpringAOPDemo {
    public static void main(String[] args) {
        ApplicationContext context = 
                new ClassPathXmlApplicationContext(
                        "beans-config.xml"); 
        IHello helloProxy = 
            (IHello) context.getBean("helloProxy"); 
        
        try { 
            helloProxy.hello("Justin"); 
        } 
        catch(Throwable throwable) { 
            // ���ε{�����ҥ~�B�z
            System.err.println(throwable);
        } 
    }
}