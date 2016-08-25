package onlyfun.caterpillar;

import java.sql.Types;

import javax.sql.DataSource;

import org.springframework.jdbc.object.SqlUpdate;

public class UserUpdate extends SqlUpdate {
    public UserUpdate(DataSource dataSource) {
        super(dataSource, "INSERT INTO user (name,age) VALUES(?,?)");
        int[] types = {Types.VARCHAR, Types.INTEGER}; 
        setTypes(types); 
        compile(); 
    }
}
