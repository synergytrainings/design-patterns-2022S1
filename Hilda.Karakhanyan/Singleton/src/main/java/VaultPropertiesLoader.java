package main.java;

import java.util.Properties;

/**
 * Lazy Singleton initialization doesn't imply thread safety
 */public class VaultPropertiesLoader extends AbstractPropertiesLoader implements ConfigPropertiesLoader {

    private static final String VAULT_URL_PROPERTIES = "Hilda.Karakhanyan/Singleton/src/resources/vault/url.properties";
    private static VaultPropertiesLoader instance;

    private VaultPropertiesLoader() {
    }

    public static VaultPropertiesLoader getInstance() {
        if (instance == null) {
            instance = new VaultPropertiesLoader();
        }
        return instance;
    }

    @Override
    public Properties loadUrlConfigs() {
        return readFromFile(VAULT_URL_PROPERTIES, getCachedUrlConfigs());
    }

}
