package onlyfun.caterpillar; 

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.
             support.BeanDefinitionRegistry;
import org.springframework.beans.factory.
             support.DefaultListableBeanFactory;
import org.springframework.beans.factory.
             support.PropertiesBeanDefinitionReader; 
import org.springframework.core.io.ClassPathResource;

public class SpringDemo { 
    public static void main(String[] args) { 
        BeanDefinitionRegistry reg = 
            new DefaultListableBeanFactory(); 
        PropertiesBeanDefinitionReader reader = 
            new PropertiesBeanDefinitionReader(reg); 
        reader.loadBeanDefinitions(
                new ClassPathResource(
                        "beans-config.properties")); 
        
        BeanFactory factory = (BeanFactory) reg; 
        HelloBean hello = 
            (HelloBean) factory.getBean("helloBean"); 
        System.out.println(hello.getHelloWord()); 
    } 
}