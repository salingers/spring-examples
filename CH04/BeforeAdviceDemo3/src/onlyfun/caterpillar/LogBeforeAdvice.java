package onlyfun.caterpillar;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LogBeforeAdvice { 
    private Logger logger = 
            Logger.getLogger(this.getClass().getName()); 
    
    @Before("execution(* onlyfun.caterpillar.IHello.*(..))" )
    public void before(JoinPoint jointPoint) { 
        logger.log(Level.INFO, 
            "method starts..." +
            jointPoint.getSignature().getDeclaringTypeName() + 
            "." + jointPoint.getSignature().getName()); 
   } 
}