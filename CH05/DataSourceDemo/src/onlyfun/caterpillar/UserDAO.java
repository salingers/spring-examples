package onlyfun.caterpillar;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sql.DataSource;

public class UserDAO implements IUserDAO {
    private DataSource dataSource;
    
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }
    
    public void insert(User user) {
       String name = user.getName();
       int age = user.getAge().intValue();
       
       Connection conn = null;
       PreparedStatement stmt = null;
       try {
           conn = dataSource.getConnection();
           stmt = conn.prepareStatement ( 
               "INSERT INTO user (name,age) VALUES(?,?)");
           stmt.setString(1, name); 
           stmt.setInt(2, age);
           stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            if(stmt != null) {
                try {
                    stmt.close();
                }   
                catch(SQLException e) {
                    e.printStackTrace();
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                }
                catch(SQLException e) {
                    e.printStackTrace();
                }
            }
        } 
    }

    public User find(Integer id) {
        Connection conn = null;
        PreparedStatement stmt = null;
        
         try {
             conn = dataSource.getConnection();
             stmt = conn.prepareStatement("SELECT * FROM user WHERE id=?");
             stmt.setInt(1, id.intValue());
             
             ResultSet result = stmt.executeQuery();
             if(result.next()) {
                 Integer i = new Integer(result.getInt(1));
                 String name = result.getString(2);
                 Integer age = new Integer(result.getInt(3));
                 
                 User user = new User();
                 user.setId(i);
                 user.setName(name);
                 user.setAge(age);
                 
                 return user;
             }
         } catch (SQLException e) {
             e.printStackTrace();
         }
         finally {
             if(stmt != null) {
                 try {
                     stmt.close();
                 }   
                 catch(SQLException e) {
                     e.printStackTrace();
                 }
             }
             if(conn != null) {
                 try {
                     conn.close();
                 }
                 catch(SQLException e) {
                     e.printStackTrace();
                 }
             }
         }    
         
         return null;
    }
}
