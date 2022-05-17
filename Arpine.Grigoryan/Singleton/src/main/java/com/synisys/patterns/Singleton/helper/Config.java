package com.synisys.patterns.Singleton.helper;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Config {
    private Properties properties;

    public String getProperty(String key) {
        return this.properties.getProperty(key);
    }

    public Config(String configFileName) {
        this.properties = new Properties();
        try {
            InputStream inputStream = getClass().getResourceAsStream(configFileName);
            //loading properties from a property file
            this.properties.load(inputStream);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
