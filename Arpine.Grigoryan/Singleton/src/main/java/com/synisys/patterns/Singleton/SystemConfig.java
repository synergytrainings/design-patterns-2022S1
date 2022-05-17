package com.synisys.patterns.Singleton;

import com.synisys.patterns.Singleton.helper.Config;

import java.util.ArrayList;

public class SystemConfig {
    // System configs
    public  final String APPLICATION_ID;

    static void classState(){
        System.out.println("Check some state for SystemConfig class ");
    }
    private SystemConfig() {
        System.out.println("SystemConfig  Class is initialized ");
        Config config = new Config("/app_config.json");

        APPLICATION_ID = config.getProperty("db.port");

    }
    //SystemConfigHelper class is not loaded into memory and only when someone calls the getInstance method
    private static class SystemConfigHelper{
        static { System.out.println("SystemConfigHelper  Class is initialized "); }
        private static final SystemConfig INSTANCE = new SystemConfig();
    }

    public static SystemConfig getInstance(){
        return SystemConfigHelper.INSTANCE;
    }
}

