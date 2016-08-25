package onlyfun.caterpillar;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.object.SqlFunction;
import org.springframework.jdbc.object.SqlQuery;
import org.springframework.jdbc.object.SqlUpdate;

public class UserDAO implements IUserDAO {
    private SqlUpdate userUpdate;
    private SqlQuery userQuery;
    private SqlFunction userFunction;

    public void setDataSource(DataSource dataSource) {
        userUpdate = new UserUpdate(dataSource);
        userQuery = new UserQuery(dataSource);
        userFunction = new UserFunction(dataSource);
    }
    
    public void insert(User user) {
        userUpdate.update(
          new Object[] {user.getName(), user.getAge()}); 
    }

    public List allUser() {
        return userQuery.execute();
    }

    public int count() {
        return userFunction.run();
    }
}
