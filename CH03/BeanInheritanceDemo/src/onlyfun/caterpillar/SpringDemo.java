package onlyfun.caterpillar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo {
    public static void main(String[] args) {
        ApplicationContext context = 
            new ClassPathXmlApplicationContext("beans-config.xml");
        SomeBean some = (SomeBean) context.getBean("some");
        System.out.println("name:" + some.getName());
        System.out.println("age:" + some.getAge());
    }
}
