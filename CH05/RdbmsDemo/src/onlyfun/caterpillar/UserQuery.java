package onlyfun.caterpillar;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sql.DataSource;

import org.springframework.jdbc.object.MappingSqlQuery;

public class UserQuery extends MappingSqlQuery {
    public UserQuery(DataSource dataSource) {
        super(dataSource, "SELECT * FROM user");
        compile();
    }
    
    protected Object mapRow(ResultSet rs, int rowNum) throws SQLException { 
        User user = new User(); 
        
        user.setId(new Integer(rs.getInt("id"))); 
        user.setName(rs.getString("name")); 
        user.setAge(new Integer(rs.getInt("age")));
        
        return user; 
    }    
}
