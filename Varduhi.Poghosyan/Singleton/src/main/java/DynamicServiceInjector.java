import exception.DynamicInjectionException;

import java.util.HashMap;
import java.util.Map;

public class DynamicServiceInjector {

    private static volatile DynamicServiceInjector instance;
    private final Map<Class, Object> providedServices;

    public static DynamicServiceInjector getInstance() {
        if (instance == null) {
            synchronized (DynamicServiceInjector.class) {
                if (instance == null) {
                    instance = new DynamicServiceInjector();
                }
            }
        }
        return instance;
    }

    private DynamicServiceInjector() {
        providedServices = new HashMap<Class, Object>();
    }

    public <T> T getService(Class<T> service) throws DynamicInjectionException {
        T serviceInstance = service.cast(providedServices.get(service));
        if (serviceInstance == null) {
            throw new DynamicInjectionException("No providers found for class " + service.getName());
        }
        return serviceInstance;

    }

    public void provideService(Class service, Object instance) throws ClassCastException {
        this.providedServices.put(service, service.cast(instance));
    }
}


