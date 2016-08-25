package onlyfun.caterpillar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.
              support.ClassPathXmlApplicationContext;
import java.util.List;

public class SpringDAODemo {
    public static void main(String[] args) {
        ApplicationContext context = 
            new ClassPathXmlApplicationContext(
                    "beans-config.xml");
        
        User user = new User();
        
        user.setName("just933");
        user.setAge(new Integer(26));
        
        IUserDAO userDAO = 
            (IUserDAO) context.getBean("userDAO");
        
        userDAO.insert(user);
        
        System.out.println("µ§¼Æ: " + userDAO.count());
        
        List list = userDAO.allUser();
        for(int i = 0; i < list.size(); i++) {
            User next = (User) list.get(i);
            System.out.println("\n\tId:\t" + next.getId());
            System.out.println("\tName:\t" + next.getName());
            System.out.println("\tAge:\t" + next.getAge());
        }
    }
}
