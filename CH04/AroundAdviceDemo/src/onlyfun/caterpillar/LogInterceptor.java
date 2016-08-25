package onlyfun.caterpillar;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LogInterceptor implements MethodInterceptor { 
    private Logger logger = 
            Logger.getLogger(this.getClass().getName()); 
    
   public Object invoke(MethodInvocation methodInvocation) 
                                           throws Throwable { 
        logger.log(Level.INFO, 
           "method starts..." + methodInvocation.getMethod()); 
        
        Object result = null;
        
        try { 
          result = methodInvocation.proceed(); 
        } 
        finally { 
            logger.log(Level.INFO, 
               "method ends..." + 
               methodInvocation.getMethod() + "\n"); 
        }

        return result; 
   } 
} 
