package onlyfun.caterpillar;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateDemo {
    public static void main(String[] args) {
        // Configuration �t�d�޲z Hibernate �t�m�T��
        Configuration config = 
            new Configuration().configure();
        // �ھ� config �إ� SessionFactory
        // SessionFactory �N�Ω�إ� Session
        SessionFactory sessionFactory = 
            config.buildSessionFactory();
        
        // �إ�DAO����
        IUserDAO userDAO = new UserDAO(sessionFactory);
        
        User user = new User();
        user.setName("caterpillar");
        user.setAge(new Integer(30));
        
        userDAO.insert(user);
        
        user = userDAO.find(new Integer(1));
        
        System.out.println("name: " + user.getName());
    }
}
