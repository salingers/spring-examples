package onlyfun.caterpillar;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LogAspect {
    private Logger logger = 
            Logger.getLogger(this.getClass().getName()); 
    
    @Pointcut("execution(* onlyfun.caterpillar.IHello.*(..))")
    private void logging() {}
    
    @Before("logging()" )
    public void before(JoinPoint jointPoint) { 
        logger.log(Level.INFO, "method starts..." +
            jointPoint.getSignature().getDeclaringTypeName() + 
            "." + jointPoint.getSignature().getName()); 
    }

    @AfterReturning(pointcut="logging()", returning="retVal")
    public void afterReturning(JoinPoint jointPoint, Object retVal) { 
        logger.log(Level.INFO, "method ends..." +
            jointPoint.getSignature().getDeclaringTypeName() + 
            "." + jointPoint.getSignature().getName()); 
    } 

    @AfterThrowing(pointcut="logging()", throwing="throwable")
    public void afterThrowing(JoinPoint jointPoint, 
                              Throwable throwable) { 
        logger.log(Level.INFO, "Logging that a " + throwable + 
            "\nException was thrown in..." +
            jointPoint.getSignature().getDeclaringTypeName() + 
            "." + jointPoint.getSignature().getName()); 
    } 
}