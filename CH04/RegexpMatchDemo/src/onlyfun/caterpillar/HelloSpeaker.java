package onlyfun.caterpillar;

public class HelloSpeaker implements IHello {
    public void helloNewbie(String name) {
        System.out.println("Hello, " + name + " newbie!"); 
    }
    
    public void helloMaster(String name) {
        System.out.println("Hello, " + name  + " master!"); 
    }
}