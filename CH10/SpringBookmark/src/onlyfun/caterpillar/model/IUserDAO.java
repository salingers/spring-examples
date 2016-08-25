package onlyfun.caterpillar.model;

public interface IUserDAO {
    public void insert(User user); 
    public User findByName(String username);
    public User findByEmail(String email);
    public void update(User user);
} 
