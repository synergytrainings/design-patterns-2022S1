package test;

import main.java.CompositeConfigLoader;
import main.java.ConsulPropertiesLoader;
import main.java.VaultPropertiesLoader;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SingletonTests {

    @Test
    void testVaultConfigsLoader() {
        VaultPropertiesLoader vaultPropertiesLoader = VaultPropertiesLoader.getInstance();
        vaultPropertiesLoader.loadUrlConfigs();
        VaultPropertiesLoader vaultPropertiesLoaderOther = VaultPropertiesLoader.getInstance();
        assertEquals(vaultPropertiesLoader, vaultPropertiesLoaderOther);
    }

    @Test
    void testConsulConfigsLoader() {
        ConsulPropertiesLoader consulPropertiesLoader = ConsulPropertiesLoader.getInstance();
        ConsulPropertiesLoader consulPropertiesLoaderOther = ConsulPropertiesLoader.getInstance();
        assertEquals(consulPropertiesLoader, consulPropertiesLoaderOther);
    }

    @Test
    void testCompositeConfigsLoader() {
        CompositeConfigLoader compositeConfigLoader = CompositeConfigLoader.getInstance();
        CompositeConfigLoader compositeConfigLoaderOther = CompositeConfigLoader.getInstance();
        assertEquals(compositeConfigLoader, compositeConfigLoaderOther);
    }

}
