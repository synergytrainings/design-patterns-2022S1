package com.synisys.patterns.Singleton;

import com.synisys.patterns.Singleton.helper.Config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Singleton impl with static block
 */
public class ElasticConfig{
    public  String RESPONSE_TIMOUT;
    public  String CACHE_DURATION;
    private static final ElasticConfig instance;

    static {
        try{
            instance = new ElasticConfig();
        }catch(IOException e){
            throw new RuntimeException("Exception occurred in creating singleton instance");
        }
    }

    public static ElasticConfig getInstance() {
        return instance;
    }

    private ElasticConfig() throws IOException {
        Properties properties = new Properties();
        //invalid file name
        InputStream inputStream = getClass().getResourceAsStream("/elastic1_config.json");
        //loading properties from a property file or other location
        properties.load(inputStream);
        RESPONSE_TIMOUT = properties.getProperty("response.Timeout");
        CACHE_DURATION = properties.getProperty("cache.duration");
    }
}

