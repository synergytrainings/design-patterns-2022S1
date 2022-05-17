package com.synisys.patterns.Singleton;

import com.synisys.patterns.Singleton.helper.Config;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class RabbitConfig {
    // Rabbit configs
    public String MESSAGE_COUNT;

    private static final RabbitConfig instance;

    static {
        try{
            instance = new RabbitConfig();
        }catch(Exception e){
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }

    public static RabbitConfig getInstance() {
        return instance;
    }

    private RabbitConfig() {
        Properties properties = new Properties();
        try {
            InputStream inputStream = getClass().getResourceAsStream("/rabbit_config.json");
            //loading properties from a property file
            properties.load(inputStream);
            MESSAGE_COUNT = properties.getProperty("max.message.count");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

