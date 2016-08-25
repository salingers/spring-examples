package onlyfun.caterpillar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Timer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.
      support.ClassPathXmlApplicationContext;

public class TimerTaskDemo {
    public static void main(String[] args) throws IOException {
    	ApplicationContext context =
            new ClassPathXmlApplicationContext("beans-config.xml");
    	
        System.out.println("啟動 Task..");
        System.out.println("請輸入 exit 關閉 Task: ");
        
        BufferedReader reader = 
            new BufferedReader(
                    new InputStreamReader(System.in));
        
        
        while(true) {
            if(reader.readLine().equals("exit")) {
                break;
            }
        }
        
        Timer timer = (Timer) context.getBean("timerFactoryBean");
    	timer.cancel();
    }
} 
