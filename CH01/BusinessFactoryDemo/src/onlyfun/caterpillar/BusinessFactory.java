package onlyfun.caterpillar;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BusinessFactory {
    private static BusinessFactory factory;

    private Properties props;

    private Business business;

    private IDeviceWriter writer;

    private BusinessFactory() throws Exception {
        props = new Properties();

        props.load(new FileInputStream("config.properties"));
        String businessClass = props.getProperty("business.class");
        String writerClass = props.getProperty("writer.class");
        business = (Business) Class.forName(businessClass).newInstance();
        writer = (IDeviceWriter) Class.forName(writerClass).newInstance();
        business.setDeviceWriter(writer);
    }

    public static BusinessFactory getInstance() throws Exception {
        if (factory == null) {
            factory = new BusinessFactory();
        }

        return factory;
    }

    public Business getBusiness() {
        return business;
    }

    public IDeviceWriter getWriter() {
        return writer;
    }
}
