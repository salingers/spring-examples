package onlyfun.caterpillar; 

import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.
                      ClassPathXmlApplicationContext; 

public class SpringDemo { 
    public static void main(String[] args) { 
        ApplicationContext context = 
            new ClassPathXmlApplicationContext(
                    "beans-config.xml");
         
        SomeBean someBean = 
            (SomeBean) context.getBean("someBean");
        
        // ���o�}�C���A�̿�`�J����
        String[] strs = 
            (String[]) someBean.getSomeStrArray();
        Some[] somes = 
            (Some[]) someBean.getSomeObjArray();
        for(int i = 0; i < strs.length; i++) {
            System.out.println(strs[i] + "," 
                    + somes[i].getName());
        }

        // ���oList���A�̿�`�J����
        System.out.println();
        List someList = (List) someBean.getSomeList(); 
        for(int i = 0; i < someList.size(); i++) {
            System.out.println(someList.get(i));
        }
        
        // ���oMap���A�̿�`�J����
        System.out.println();
        Map someMap = (Map) someBean.getSomeMap();
        System.out.println(someMap.get("MapTest"));
        System.out.println(someMap.get("someKey1"));
    } 
}
