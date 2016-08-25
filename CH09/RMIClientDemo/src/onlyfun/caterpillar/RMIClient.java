package onlyfun.caterpillar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.
              support.ClassPathXmlApplicationContext;

public class RMIClient {
    public static void main(String[] args) {
        ApplicationContext context =
            new ClassPathXmlApplicationContext(
                    "rmi-client.xml");

        ISomeService service = 
            (ISomeService) context.getBean("someServiceProxy");

        String result1 = service.doSomeService("Some request");
        System.out.println(result1);

        int result2 = service.doOtherService(1);
        System.out.println(result2);
    }
} 
