package onlyfun.caterpillar; 

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.
                        ClassPathXmlApplicationContext;

public class SpringDemo { 
    public static void main(String[] args) { 
        ApplicationContext context = 
            new ClassPathXmlApplicationContext("beans-config.xml");
         
        HelloBean hello = 
            (HelloBean) context.getBean("helloBean");
        
        System.out.print("Word: ");
        System.out.println(hello.getHelloWord());
        System.out.print("Date: ");
        System.out.println(hello.getDate());
    } 
}
