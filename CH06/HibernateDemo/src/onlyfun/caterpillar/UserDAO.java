package onlyfun.caterpillar;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class UserDAO implements IUserDAO {
    private SessionFactory sessionFactory; 
    
    public UserDAO() {
    }
    
    public UserDAO(SessionFactory sessionFactory) { 
        this.setSessionFactory(sessionFactory);
    }
    
    public void setSessionFactory(SessionFactory sessionFactory) { 
        this.sessionFactory = sessionFactory; 
    } 
    
    public void insert(User user) {
        // 取得Session
        Session session = sessionFactory.openSession();
        // 開啟交易
        Transaction tx= session.beginTransaction();
        // 直接儲存物件
        session.save(user); 
        // 送出交易
        tx.commit();
        session.close(); 
    }

    public User find(Integer id) {
        Session session = sessionFactory.openSession(); 
        
        User user = (User) session.load(User.class, id);
        Hibernate.initialize(user);
        
        session.close();
        
        return user;
    }
}
