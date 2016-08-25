package onlyfun.caterpillar; 

import org.springframework.aop.
             support.DelegatingIntroductionInterceptor; 
import org.aopalliance.intercept.MethodInvocation; 
import org.springframework.aop.
             framework.AopConfigException;

public class LockIntroduction 
              extends DelegatingIntroductionInterceptor 
              implements ILockable { 
    private boolean locked; 

    public Object invoke(MethodInvocation invocation) 
                       throws Throwable {
        // locked 為true下不能呼叫set方法
        if (isLocked() && 
            invocation.getMethod().
                       getName().indexOf("set") == 0) {
            throw new AopConfigException(
                                "物件被鎖定！！"); 
        }
        
        return super.invoke(invocation); 
    } 
    
    public void lock() { 
        locked = true; 
    } 

    public void unlock() { 
        locked = false; 
    } 

    public boolean isLocked() { 
        return locked; 
    } 
}