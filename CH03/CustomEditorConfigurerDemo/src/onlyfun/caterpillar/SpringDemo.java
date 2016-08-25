package onlyfun.caterpillar; 

import org.springframework.context.ApplicationContext;
import org.springframework.context.
             support.ClassPathXmlApplicationContext; 

public class SpringDemo { 
    public static void main(String[] args) { 
        ApplicationContext context = 
            new ClassPathXmlApplicationContext(
                    "beans-config.xml");
         
        HelloBean hello = 
            (HelloBean) context.getBean("helloBean");
        System.out.println(hello.getHelloWord() + "!");
        System.out.println("Name:\t" 
                + hello.getUser().getName());  
        System.out.println("Number:\t" 
                + hello.getUser().getNumber());
    } 
}