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
        // ���oSession
        Session session = sessionFactory.openSession();
        // �}�ҥ��
        Transaction tx= session.beginTransaction();
        // �����x�s����
        session.save(user); 
        // �e�X���
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
