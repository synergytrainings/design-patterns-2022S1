package main.java.com.synisys.singleton.factory;

import main.java.com.synisys.singleton.Config;

public class ConfigurationFactory {

    public Config getConfiguration(String source){
        if(source == null){
            return null;
        }
        if(source.equalsIgnoreCase("CONSUL")){
            return new ConsulConfig();

        } else if(source.equalsIgnoreCase("VAULT")){
            return new VaultConfig();

        }
        return null;
    }



}

