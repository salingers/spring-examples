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
        
        // ����S���Q��w�A�i�H�I�sset��k
        some.setSome("justin"); 
        System.out.println(some.getSome()); 
        
        try { 
            // ����Q��w 
            ((ILockable) some).lock();
            
            // �L�k�I�sset��k�A��X�ҥ~
            some.setSome("momor"); 
            // �ѩ�|��X�ҥ~�A�ҥH�U�����o��{���L�k�Q���� 
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