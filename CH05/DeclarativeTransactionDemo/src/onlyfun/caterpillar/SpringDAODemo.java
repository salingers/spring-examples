package onlyfun.caterpillar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.
              support.ClassPathXmlApplicationContext;

public class SpringDAODemo {
    public static void main(String[] args) {
        ApplicationContext context = 
            new ClassPathXmlApplicationContext(
                    "beans-config.xml");
        
        User user = new User();
        
        user.setName("caterpillar");
        user.setAge(new Integer(30));
        
        IUserDAO userDAO = 
            (IUserDAO) context.getBean("userDAOProxy");
        
        userDAO.insert(user);
        
        user = userDAO.find(new Integer(1));
        
        System.out.println("name: " + user.getName());
    }
}
