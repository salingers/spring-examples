package onlyfun.caterpillar; 

import java.util.Calendar;
import java.util.Locale;
import org.springframework.context.ApplicationContext;
import org.springframework.context.
               support.ClassPathXmlApplicationContext;

public class SpringDemo { 
    public static void main(String[] args) { 
        ApplicationContext context = 
            new ClassPathXmlApplicationContext(
                    "beans-config.xml"); 

        Object[] arguments = 
            new Object[] {"¨}¸¯®æ", 
                          Calendar.getInstance().getTime()}; 

        System.out.println(
                context.getMessage("userLogin", 
                                   arguments, 
                                   Locale.US)); 
        System.out.println(
                context.getMessage("userLogin", 
                                    arguments, 
                                    Locale.TAIWAN)); 
    } 
}