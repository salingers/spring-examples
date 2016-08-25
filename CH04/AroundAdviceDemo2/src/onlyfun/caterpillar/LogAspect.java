package onlyfun.caterpillar;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.aspectj.lang.ProceedingJoinPoint;

public class LogAspect {
    private Logger logger = 
            Logger.getLogger(this.getClass().getName()); 
    
    public Object invoke(ProceedingJoinPoint jointPoint) throws Throwable { 
        logger.log(Level.INFO, "method starts..." +
            jointPoint.getSignature().getDeclaringTypeName() + 
            "." + jointPoint.getSignature().getName()); 

        Object retVal = jointPoint.proceed();
        
        logger.log(Level.INFO, "method ends..." +
            jointPoint.getSignature().getDeclaringTypeName() + 
            "." + jointPoint.getSignature().getName()); 
        
        return retVal;
    } 
}