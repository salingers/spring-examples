package onlyfun.caterpillar;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.sql.DataSource;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

public class UserDAO implements IUserDAO {
    private NamedParameterJdbcTemplate jdbcTemplate;
    
    public void setDataSource(DataSource dataSource) {
        jdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }
    
    public void insert(User user) {     
       String sql = "INSERT INTO user (name,age) VALUES(:name, :age)";
       SqlParameterSource namedParameters = 
           new BeanPropertySqlParameterSource(user);
       
       jdbcTemplate.update(sql, namedParameters);
    }

    public User find(Integer id) {
        String sql = "SELECT * FROM user WHERE id=:userId";
        SqlParameterSource namedParameters = new MapSqlParameterSource("userId", id);
        List rows = jdbcTemplate.queryForList(sql, namedParameters);
        
        Iterator it = rows.iterator();
        if(it.hasNext()) {
            Map userMap = (Map) it.next();

            Integer i = new Integer(userMap.get("id").toString());
            String name = userMap.get("name").toString();
            Integer age = 
                  new Integer(userMap.get("age").toString());

            User user = new User();
            user.setId(i);
            user.setName(name);
            user.setAge(age);
            
            return user;
        }

        return null;
    }
}
