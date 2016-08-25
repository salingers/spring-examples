package onlyfun.caterpillar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.
              support.ClassPathXmlApplicationContext;

public class SpringHibernateDemo {
    public static void main(String[] args) {
        ApplicationContext context = 
            new ClassPathXmlApplicationContext(
                    "beans-config.xml");
        
        // 建立DAO物件
        IUserDAO userDAO = 
            (IUserDAO) context.getBean("userDAO");
        
        User user = new User();
        user.setName("caterpillar");
        user.setAge(new Integer(30));
        
        userDAO.insert(user);
        
        user = userDAO.find(new Integer(1));
        
        System.out.println("name: " + user.getName());
    }
}
