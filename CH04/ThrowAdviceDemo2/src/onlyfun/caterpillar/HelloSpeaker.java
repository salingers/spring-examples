package onlyfun.caterpillar;

public class HelloSpeaker implements IHello {
    public void hello(String name) throws Throwable {                           
        System.out.println("Hello, " + name);
        // ��p�I�{�����~�I�o�ͨҥ~XD
        throw new Exception("�o�ͨҥ~...");
    }
}