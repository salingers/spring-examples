package onlyfun.caterpillar;

public class UserChecker {
    public String check(String username) {
        if(username != null) {
            return username;
        }
        else {
            return "guest";
        }
    }
}
