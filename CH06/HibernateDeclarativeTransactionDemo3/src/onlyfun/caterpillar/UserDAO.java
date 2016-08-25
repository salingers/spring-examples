package onlyfun.caterpillar;

import org.hibernate.SessionFactory;
import org.springframework.orm.
             hibernate3.HibernateTemplate;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public class UserDAO implements IUserDAO {
    private HibernateTemplate hibernateTemplate;

    public void setSessionFactory(
            SessionFactory sessionFactory) { 
        hibernateTemplate = 
            new HibernateTemplate(sessionFactory); 
    } 
    
    @Transactional(propagation = Propagation.REQUIRED)
    public void insert(User user) {
        hibernateTemplate.save(user);
    }

    @Transactional(readOnly=true)
    public User find(Integer id) {
        User user = (User) hibernateTemplate.get(User.class, id);
        
        return user;
    }
}
