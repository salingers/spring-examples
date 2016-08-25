package onlyfun.caterpillar;

public class User {
    private String name;
    private UserChanger userChanger;
   
    public void setName(String name) {
        this.name = getUserChanger().getChangedName(name);
    }
   
    public String getName() {
        return name;
    }
    
    public void setUserChanger(UserChanger userChanger) {
        this.userChanger = userChanger;
    }
    
    public UserChanger getUserChanger() {
        return userChanger; 
    }
}