package onlyfun.caterpillar; 

public class HelloBean { 
    private String helloWord;
    private User user;

    public void setHelloWord(String helloWord) { 
        this.helloWord = helloWord;
    } 
    public String getHelloWord() { 
        return helloWord; 
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    } 
}