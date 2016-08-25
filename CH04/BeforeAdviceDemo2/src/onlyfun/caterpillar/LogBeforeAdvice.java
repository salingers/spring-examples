package onlyfun.caterpillar;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;

public class LogBeforeAdvice { 
    private Logger logger = 
            Logger.getLogger(this.getClass().getName()); 
    
    public void before(JoinPoint jointPoint) { 
        logger.log(Level.INFO, 
            "method starts..." +
            jointPoint.getSignature().getDeclaringTypeName() + 
            "." + jointPoint.getSignature().getName()); 
   } 
}