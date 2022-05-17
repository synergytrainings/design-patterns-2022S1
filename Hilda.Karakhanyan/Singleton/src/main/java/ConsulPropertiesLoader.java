package main.java;

import java.util.Properties;

/**
 * Thread safe Singleton Implementation
 */
public class ConsulPropertiesLoader extends AbstractPropertiesLoader implements ConfigPropertiesLoader {

    public static final String CONSUL_URL_PROPERTIES = "Hilda.Karakhanyan/Singleton/src/resources/consul/url.properties";
    private static ConsulPropertiesLoader instance;

    private ConsulPropertiesLoader() {
    }

    public static ConsulPropertiesLoader getInstance() {
        if(instance == null){
            synchronized (ConsulPropertiesLoader.class) {
                if(instance == null){
                    instance = new ConsulPropertiesLoader();
                }
            }
        }
        return instance;
    }

    @Override
    public Properties loadUrlConfigs() {
        return readFromFile(CONSUL_URL_PROPERTIES, getCachedUrlConfigs());
    }
}
