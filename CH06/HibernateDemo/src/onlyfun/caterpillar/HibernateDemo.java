package onlyfun.caterpillar;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateDemo {
    public static void main(String[] args) {
        // Configuration 負責管理 Hibernate 配置訊息
        Configuration config = 
            new Configuration().configure();
        // 根據 config 建立 SessionFactory
        // SessionFactory 將用於建立 Session
        SessionFactory sessionFactory = 
            config.buildSessionFactory();
        
        // 建立DAO物件
        IUserDAO userDAO = new UserDAO(sessionFactory);
        
        User user = new User();
        user.setName("caterpillar");
        user.setAge(new Integer(30));
        
        userDAO.insert(user);
        
        user = userDAO.find(new Integer(1));
        
        System.out.println("name: " + user.getName());
    }
}
