package onlyfun.caterpillar; 

import org.springframework.context.ApplicationContext;
import org.springframework.context.
               support.ClassPathXmlApplicationContext;

public class SpringDemo { 
    public static void main(String[] args) { 
        ApplicationContext context = 
            new ClassPathXmlApplicationContext(
                    "beans-config.xml"); 
        context.publishEvent(new SomeEvent(SpringDemo.class));
    } 
}