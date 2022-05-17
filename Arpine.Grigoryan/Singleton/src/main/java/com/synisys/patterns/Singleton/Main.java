package com.synisys.patterns.Singleton;

public class Main {
    public static void main(String[] args) {
        DbConfig dbConfig = DbConfig.config();
        ElasticConfig elConfig = ElasticConfig.config();
        RabbitConfig rabbitConfig = RabbitConfig.getInstance();

    }
    }
