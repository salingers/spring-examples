package onlyfun.caterpillar.model;

import java.util.List;
import org.springframework.orm.hibernate3.HibernateTemplate;

public class UserDAO implements IUserDAO {
    private HibernateTemplate hibernateTemplate;
    
    public void setHibernateTemplate(
            HibernateTemplate hibernateTemplate) { 
        this.hibernateTemplate = hibernateTemplate;
    }
    
    public void insert(User user) {  
        hibernateTemplate.saveOrUpdate(user);
    }
    
    public User findByName(String username) {
    	if(username.equals("")) {
    		return null;
    	}
    		
        List users = hibernateTemplate.find(
                "from User user where user.username='" 
                + username + "'");
        return (User) users.get(0);
    }

    public User findByEmail(String email) {
        List users = hibernateTemplate.find(
                "from User user where user.email='" 
                + email + "'");
        return (User) users.get(0);
    }
    
    public void update(User user) {
        hibernateTemplate.update(user);
    }
} 
