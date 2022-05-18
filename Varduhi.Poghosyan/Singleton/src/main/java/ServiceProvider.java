import exception.DynamicInjectionException;
import services.CategoryStructureProviderService;
import services.SharedPropertiesService;

public class ServiceProvider {

    private static volatile ServiceProvider instance;

    public static void provideServices(String source) throws DynamicInjectionException {
        if (instance == null) {
            synchronized (ServiceProvider.class) {
                if (instance == null) {
                    instance = new ServiceProvider(source);
                }
            }
        }
    }

    private ServiceProvider(String source) throws DynamicInjectionException {
        DynamicServiceInjector dynamicServiceInjector = DynamicServiceInjector.getInstance();
        dynamicServiceInjector.provideService(SharedPropertiesService.class, new SharedPropertiesService(source));
        dynamicServiceInjector.provideService(CategoryStructureProviderService.class,
                new CategoryStructureProviderService(dynamicServiceInjector.getService(SharedPropertiesService.class)));
    }
}
