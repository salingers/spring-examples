package onlyfun.caterpillar;

import javax.sql.DataSource;

import org.springframework.jdbc.object.SqlFunction;

public class UserFunction extends SqlFunction {
    public UserFunction(DataSource dataSource) {
        super(dataSource, "SELECT COUNT(*) from user");
        compile();
    }
}
