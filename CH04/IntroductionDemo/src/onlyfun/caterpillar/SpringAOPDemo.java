package onlyfun.caterpillar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.
              support.ClassPathXmlApplicationContext;

public class SpringAOPDemo {
    public static void main(String[] args) {
        ApplicationContext context = 
            new ClassPathXmlApplicationContext(
                    "beans-config.xml"); 
    
        ISome some = 
            (ISome) context.getBean("proxyFactoryBean"); 
    
        some.doSome();
    
        // �ݨӦn��some����ʺA�W�[�F¾�d
        ((IOther) some).doOther();
    }
}