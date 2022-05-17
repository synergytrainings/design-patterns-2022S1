package main.java.com.synisys.singleton;

import main.java.com.synisys.singleton.factory.ConfigurationFactory;

import java.util.Map;

public class ConfigurationManager {

    private static volatile ConfigurationManager instance;
    ConfigurationFactory factory = new ConfigurationFactory();
    private String environment;
    private Map<String, String> urls;

    private ConfigurationManager(String source, String environment) {
        urls = factory.getConfiguration(source).getConfig();
        this.environment = environment;
    }

    public static ConfigurationManager getInstance(String source, String environment) {
        if (instance == null) {
            synchronized (ConfigurationManager.class) {
                if (instance == null) {
                    instance = new ConfigurationManager(source, environment);
                }
            }
        }
        return instance;
    }

    public void configure(String serviceName, String url) {
        urls.put(serviceName, url);
    }

    public String readConfig(String serviceName) {
        return environment + "/" + urls.get(serviceName); //Use AbstractFactory pattern to resolve url based on environment
    }
}

