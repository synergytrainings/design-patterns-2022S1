package main.java.com.synisys.singleton.factory;

import main.java.com.synisys.singleton.Config;
import main.java.com.synisys.singleton.helper.ConfigHelper;

import java.util.Map;

public class VaultConfig implements Config {

    @Override
    public Map<String, String> getConfig() {
        return ConfigHelper.decryptConfig(readConfigFromVault());
    }

    public String readConfigFromVault() {
        return "EncryptedVaultConfig";
    }
}
