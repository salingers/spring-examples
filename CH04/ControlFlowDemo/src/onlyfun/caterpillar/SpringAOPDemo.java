package onlyfun.caterpillar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.
              support.ClassPathXmlApplicationContext;

public class SpringAOPDemo {
    public static void main(String[] args) {
        ApplicationContext context = 
                new ClassPathXmlApplicationContext(
                        "beans-config.xml");
        
        Some some = (Some) context.getBean("some");
        
        if(args.length > 0 && "run".equals(args[0])) {
            some.helloEverybody();
        }
        else {
            some.hello();
        }
    }
}