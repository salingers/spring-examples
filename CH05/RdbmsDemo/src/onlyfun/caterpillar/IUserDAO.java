package onlyfun.caterpillar;

import java.util.List;

public interface IUserDAO {
    public void insert(User user);
    public List allUser();
    public int count();
}
