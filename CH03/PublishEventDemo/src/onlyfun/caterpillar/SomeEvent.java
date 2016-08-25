package onlyfun.caterpillar;

import org.springframework.context.ApplicationEvent;

public class SomeEvent extends ApplicationEvent {
    public SomeEvent(Object source) {
        super(source);
    }
}
