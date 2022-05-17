package main.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * Bill Pugh / static class Singleton Implementation which also implies thread safety
 */
public class CompositeConfigLoader implements ConfigPropertiesLoader {

    private final List<ConfigPropertiesLoader> configPropertiesLoaders = new ArrayList<>();

    private static class SingletonHelper {
        private static final CompositeConfigLoader INSTANCE = new CompositeConfigLoader();
    }

    private CompositeConfigLoader() {
        configPropertiesLoaders.addAll(List.of(ConsulPropertiesLoader.getInstance(),
                VaultPropertiesLoader.getInstance()));
    }

    public static CompositeConfigLoader getInstance() {
        return SingletonHelper.INSTANCE;
    }

    // just merges all configs together, overwriting existing properties
    @Override
    public Properties loadUrlConfigs() {
        Properties properties = new Properties();
        configPropertiesLoaders.forEach(loader -> {
            properties.putAll(loader.loadUrlConfigs());
        });
        return properties;
    }
}
