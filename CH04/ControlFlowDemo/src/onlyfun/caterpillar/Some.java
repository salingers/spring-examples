package onlyfun.caterpillar;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Some implements ApplicationContextAware {
    private IHello helloProxy;

    public void setApplicationContext(
            ApplicationContext context) throws BeansException {
        
        helloProxy = (IHello) context.getBean("helloProxy");
    }
    
    public void helloEverybody() {
        helloProxy.helloNewbie("Justin"); 
        helloProxy.helloMaster("caterpillar"); 
    }
    
    public void hello() {
        System.out.println("Hello!");
    }
}
