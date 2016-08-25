package onlyfun.caterpillar;

public interface IUserDAO {
    public void insert(User user);
    public User find(Integer id);
}
