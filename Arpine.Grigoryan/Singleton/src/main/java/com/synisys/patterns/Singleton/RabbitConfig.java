package com.synisys.patterns.Singleton;

import com.synisys.patterns.Singleton.helper.Config;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.Properties;
/**
 * Serializable Singleton impl
 */
public class RabbitConfig implements Serializable {
    private static final long serialVersionUID = 2132854814575269211L;

    // Rabbit configs
    public final String MESSAGE_COUNT;

    private  RabbitConfig() {
        Config config = new Config("/rabbit_config.json");

        // Database Config Parameters
        MESSAGE_COUNT = config.getProperty("max.message.count");
    }

    private static class SingletonHelper{
        private static final RabbitConfig instance = new RabbitConfig();
    }

    public static RabbitConfig getInstance(){
        return SingletonHelper.instance;
    }

    protected Object readResolve() {
        return getInstance();
    }

}

