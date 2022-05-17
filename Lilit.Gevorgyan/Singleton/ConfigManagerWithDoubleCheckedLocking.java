package Singleton;
import java.util.HashMap;
import java.util.Map;

class ConfigManagerWithDoubleCheckedLocking {

    public volatile static ConfigManagerWithDoubleCheckedLocking instance;

    private Map<String, String> configMap = new HashMap<String, String>() {{
        put("host", "internal.db");
        put("port", "8179");
        put("user", "admin");
        put("password", "pa$$w0rD");
    }};

    private ConfigManagerWithDoubleCheckedLocking() {

    }

    public String update(String key, String value) {
        return configMap.put(key, value);
    }

    public String get(String key) {
        return configMap.get(key);
    }

    /**
     * The method uses double checked locking for initializing the instance.
     *
     * @return new Config Manager
     */
    public static ConfigManagerWithDoubleCheckedLocking getInstance() {
        if (instance == null) {
            // the synchronized block is only inside the this if because
            // only on this section multiple threads can try to initialize the instance
            synchronized (ConfigManagerWithDoubleCheckedLocking.class) {
                // one more null check because the other threads that have acquired the lock would have initialized it
                if (instance == null) {
                    instance = new ConfigManagerWithDoubleCheckedLocking();
                }
            }
        }
        return instance;
    }
}
