package onlyfun.caterpillar.model;

public class Bookmark {
    private Integer id;
    private String username;
    private String url;
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    public Integer getId() {
        return id;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getUrl() {
        return url;
    }   

    public void setUrl(String url) {
        this.url = url;
    }
    
    public String getUsername() {
        return username;
    }
} 
