package synisys.training.designPatterns.singleton;

import java.util.Date;

/**
 * @author harut.arakelyan
 *
 * Let's say we have some configurations which we should load from somewhere for the Application and we must have only one instance.
 * This implementation way guarantees lazy initialization and is thread-safe for a single instance. It avoids reflection
 */
public class AppConfiguration {
    // some fields
    public  Long configLoadTime;

    private AppConfiguration(){
        //avoid reflection
        if(AppConfigurationHolder.INSTANCE != null){
            throw new  UnsupportedOperationException("Use AppConfiguration.getInstance()");
        }

        loadConfiguration();
    }

    public static AppConfiguration getInstance(){
        return AppConfigurationHolder.INSTANCE;
    }

    private void loadConfiguration(){
        //do something
        configLoadTime = new Date().getTime();
    }

    private static class AppConfigurationHolder {
        private static final AppConfiguration INSTANCE = new AppConfiguration();
    }

}
