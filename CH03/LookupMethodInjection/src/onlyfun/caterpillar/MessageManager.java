package onlyfun.caterpillar;

public abstract class MessageManager {
    public void display() {
        Message message = createMessage();
        System.out.println(message);
    }
    
    protected abstract Message createMessage();
}
