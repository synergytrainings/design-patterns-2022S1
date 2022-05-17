package com.synisys.patterns.Singleton;

import com.synisys.patterns.Singleton.helper.Config;

public class ElasticConfig {
    public final String RESPONSE_TIMOUT;
    public final String CACHE_DURATION;

    private static final ElasticConfig instance = new ElasticConfig();

    public static ElasticConfig config() {
        return instance;
    }

    private ElasticConfig() {
        Config config = new Config("/elastic_config.json");
        RESPONSE_TIMOUT = config.getProperty("response.Timeout");
        CACHE_DURATION = config.getProperty("cache.duration");


    }


}

