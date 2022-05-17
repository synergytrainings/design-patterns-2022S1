package main.java.com.synisys.singleton.factory;

import main.java.com.synisys.singleton.Config;
import main.java.com.synisys.singleton.helper.ConfigHelper;

import java.util.HashMap;
import java.util.Map;

public class ConsulConfig implements Config {

    @Override
    public Map<String, String> getConfig() {
        return ConfigHelper.decryptConfig(readConfigFromConsul());
    }

    public String readConfigFromConsul() {
        return "EncryptedConsulConfig";
    }
}
