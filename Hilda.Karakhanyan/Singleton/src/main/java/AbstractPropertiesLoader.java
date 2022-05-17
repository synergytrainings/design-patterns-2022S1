package main.java;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public abstract class AbstractPropertiesLoader {
    private Properties cachedUrlConfigs;

    public Properties getCachedUrlConfigs() {
        return cachedUrlConfigs;
    }

    protected Properties readFromFile(String path, Properties destination) {
        try {
            if (destination == null) {
                FileReader reader = new FileReader(path);
                destination = new Properties();
                destination.load(reader);
            }
            return destination;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
