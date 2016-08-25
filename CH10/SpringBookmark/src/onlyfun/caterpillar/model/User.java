package onlyfun.caterpillar.model;

public class User {
    private Integer id;
    private String email;
    private String username;
    private String passwd;
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    public Integer getId() {
        return id;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    public void setPasswd(String passwd) {
        this.passwd = passwd;
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
} 
