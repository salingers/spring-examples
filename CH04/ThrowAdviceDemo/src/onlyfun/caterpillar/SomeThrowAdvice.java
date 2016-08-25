package onlyfun.caterpillar;

import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.aop.ThrowsAdvice;

public class SomeThrowAdvice implements ThrowsAdvice { 
    private Logger logger = 
            Logger.getLogger(this.getClass().getName()); 
    public void afterThrowing(Method method, Object[] args, 
                              Object target, Throwable subclass) { 
        // °O¿ý¨Ò¥~ 
        logger.log(Level.INFO, 
                "Logging that a " + subclass + 
                "Exception was thrown in " + method); 

    } 
}