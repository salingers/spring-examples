package onlyfun.caterpillar;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;

public class LogAspect {
    private Logger logger = 
            Logger.getLogger(this.getClass().getName()); 
    
    public void before(JoinPoint jointPoint) { 
        logger.log(Level.INFO, "method starts..." +
            jointPoint.getSignature().getDeclaringTypeName() + 
            "." + jointPoint.getSignature().getName()); 
    }

    public void afterReturning(JoinPoint jointPoint) { 
        logger.log(Level.INFO, "method ends..." +
            jointPoint.getSignature().getDeclaringTypeName() + 
            "." + jointPoint.getSignature().getName()); 
    } 
}