package onlyfun.caterpillar; 

public class HelloBean {
    private String name;
    private String helloWord;

    // 建議要有無參數建構方法
    public HelloBean() {
    }   
    public HelloBean(String name, String helloWord) {
        this.name = name;
        this.helloWord = helloWord;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setHelloWord(String helloWord) { 
        this.helloWord = helloWord; 
    } 
    public String getHelloWord() { 
        return helloWord; 
    } 
}
