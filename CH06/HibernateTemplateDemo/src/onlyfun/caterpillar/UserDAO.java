package onlyfun.caterpillar;

import org.hibernate.SessionFactory;
import org.springframework.orm.
             hibernate3.HibernateTemplate;

public class UserDAO implements IUserDAO {
    private HibernateTemplate hibernateTemplate;

    public void setSessionFactory(
            SessionFactory sessionFactory) { 
        hibernateTemplate = 
            new HibernateTemplate(sessionFactory); 
    } 
    
    public void insert(User user) {
        hibernateTemplate.save(user);
    }

    public User find(Integer id) {
        User user = (User) hibernateTemplate.get(User.class, id);
        
        return user;
    }
}
