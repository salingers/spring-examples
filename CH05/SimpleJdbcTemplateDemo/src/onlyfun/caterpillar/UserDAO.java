package onlyfun.caterpillar;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sql.DataSource;
import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;

public class UserDAO implements IUserDAO {
    private SimpleJdbcTemplate jdbcTemplate;
    
    public void setDataSource(DataSource dataSource) {
        jdbcTemplate = new SimpleJdbcTemplate(dataSource);
    }
    
    public void insert(User user) {
        String sql = "INSERT INTO user (name,age) VALUES(?, ?)";
        String name = user.getName();
        Integer age = user.getAge();
        
        jdbcTemplate.update(sql, new Object[] {name, age});
     }

    public User find(Integer id) {
        String sql = "SELECT * FROM user WHERE id=?";
        
        ParameterizedRowMapper<User> mapper = new ParameterizedRowMapper<User>() {
            public User mapRow(ResultSet rs, int rowNum) throws SQLException {
                User user = new User();
                user.setId(new Integer(rs.getInt("id")));
                user.setName(rs.getString("name"));
                user.setAge(new Integer(rs.getInt("age")));
                return user;
            }
        };

        return jdbcTemplate.queryForObject(sql, mapper, id);
    }
}
