package onlyfun.caterpillar;

import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.
                  handler.HandlerInterceptorAdapter;

public class LoggingInterceptor 
        extends HandlerInterceptorAdapter {
    private Logger logger = 
            Logger.getLogger(this.getClass().getName());
    
    public boolean preHandle(HttpServletRequest request,
                    HttpServletResponse response, 
                    Object handler) throws Exception {
        logger.info(
                handler.getClass().getName() + " �}�l����...");
        return true;
    }
    
    public void postHandle(HttpServletRequest request, 
                HttpServletResponse response, 
                Object handler, 
                ModelAndView modelAndView) throws Exception {
        logger.info(
                handler.getClass().getName() + " ���槹��...");
    }
    
    public void afterCompletion(HttpServletRequest request,
                HttpServletResponse response, 
                Object handler, 
                Exception ex) throws Exception {
        logger.info("�ШD�B�z����...");
    }
}
