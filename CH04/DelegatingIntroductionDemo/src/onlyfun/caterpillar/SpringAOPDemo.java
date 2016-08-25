package onlyfun.caterpillar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.
              support.ClassPathXmlApplicationContext;

public class SpringAOPDemo {
    public static void main(String[] args) throws Exception {
        ApplicationContext context = 
                new ClassPathXmlApplicationContext(
                        "beans-config.xml"); 
        
        ISome some = 
            (ISome) context.getBean("proxyFactoryBean"); 
        
        // 物件沒有被鎖定，可以呼叫set方法
        some.setSome("justin"); 
        System.out.println(some.getSome()); 
        
        try { 
            // 物件被鎖定 
            ((ILockable) some).lock();
            
            // 無法呼叫set方法，丟出例外
            some.setSome("momor"); 
            // 由於會丟出例外，所以下面的這行程式無法被執行 
            System.out.println(some.getSome()); 
        } 
        catch(Throwable e) { 
            e.printStackTrace();
        } 
        
        // Object is unlocked. 
        ((ILockable) some).unlock(); 
        // It's ok to use setter again. 
        some.setSome("momor"); 
        System.out.println(some.getSome()); 
    }
}