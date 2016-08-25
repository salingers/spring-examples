package onlyfun.caterpillar;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class CustomListener implements ApplicationListener {
    public void onApplicationEvent(ApplicationEvent event) {
        if(event instanceof SomeEvent) {
            System.out.println(event.getSource());
        }
    }
}
