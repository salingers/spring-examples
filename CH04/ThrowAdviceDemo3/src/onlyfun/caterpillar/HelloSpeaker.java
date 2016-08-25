package onlyfun.caterpillar;

public class HelloSpeaker implements IHello {
    public void hello(String name) throws Throwable {                           
        System.out.println("Hello, " + name);
        // 抱歉！程式錯誤！發生例外XD
        throw new Exception("發生例外...");
    }
}