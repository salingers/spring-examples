package onlyfun.caterpillar; 

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.beans.factory.BeanFactory; 
import org.springframework.beans.factory.xml.XmlBeanFactory; 

public class SpringDemo { 
    public static void main(String[] args) { 
        Resource rs = 
            new ClassPathResource("beans-config.xml"); 
        BeanFactory factory = new XmlBeanFactory(rs); 
        
        Business business = 
            (Business) factory.getBean("business"); 
        business.save();
    } 
}
