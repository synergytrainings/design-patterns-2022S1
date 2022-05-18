import exception.DynamicInjectionException;
import services.CategoryStructureProviderService;

public class TestServices {

    public static void main(String[] args) throws ClassCastException, DynamicInjectionException {
        ServiceProvider.provideServices("some-valid-source");
        System.out.println(DynamicServiceInjector.getInstance()
                .getService(CategoryStructureProviderService.class).getStructure("Application"));
        DynamicServiceInjector.getInstance().getService(TestServices.class);
    }
}
