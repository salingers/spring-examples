package onlyfun.caterpillar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.
       support.ClassPathXmlApplicationContext;
import org.springframework.remoting.rmi.RmiServiceExporter;

public class RMIServer {
    public static void main(String[] args) 
                           throws IOException {
    	ApplicationContext context =
          new ClassPathXmlApplicationContext("rmi-server.xml");
        
        System.out.println("啟動 RMI Server..");
        System.out.println("請輸入 exit 關閉 Server: ");
        
        BufferedReader reader = 
            new BufferedReader(
                    new InputStreamReader(System.in));
        
        while(true) {
            if(reader.readLine().equals("exit")) {
                break;
            }
        }

        RmiServiceExporter rmiServiceExporter = 
             (RmiServiceExporter) context.getBean("serviceExporter");
        rmiServiceExporter.destroy();
    }
} 
