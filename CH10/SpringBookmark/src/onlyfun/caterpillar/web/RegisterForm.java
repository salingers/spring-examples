package onlyfun.caterpillar.web;

public class RegisterForm {
    private String email;
    private String username;
    private String passwd;
    private String passwd2;
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }
    
    public void setPasswd2(String passwd2) {
        this.passwd2 = passwd2;
    }
    
    public String getEmail() {
        return email;
    }
    
    public String getUsername() {
        return username;
    }
        
    public String getPasswd() {
        return passwd;
    }
            
    public String getPasswd2() {
        return passwd2;
    }
}
