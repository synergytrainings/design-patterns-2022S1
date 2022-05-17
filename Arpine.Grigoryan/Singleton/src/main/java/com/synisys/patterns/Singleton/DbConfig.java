package com.synisys.patterns.Singleton;

import com.synisys.patterns.Singleton.helper.Config;

public class DbConfig {

    // DB configs
    public final String DB_HOST;
    public final String DB_PORT;
    public final String DB_DB_NAME;
    public final String DB_USER;
    public final String DB_PASSWORD;

    private static final DbConfig instance = new DbConfig();

    public static DbConfig config() {
        return instance;
    }

    private DbConfig() {
        Config config = new Config("/db_config.json");

        // Database Config Parameters
        DB_HOST = config.getProperty("db.host");
        DB_PORT = config.getProperty("db.port");
        DB_DB_NAME = config.getProperty("db.db_name");
        DB_USER = config.getProperty("db.user");
        DB_PASSWORD = config.getProperty("db.password");
    }
}

