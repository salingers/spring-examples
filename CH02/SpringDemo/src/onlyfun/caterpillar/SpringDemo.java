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
        
        HelloBean hello = 
            (HelloBean) factory.getBean("helloBean"); 
        System.out.println(hello.getHelloWord()); 
    } 
}
