package services;

public class CategoryStructureProviderService {

    private SharedPropertiesService sharedPropertiesService;

    public CategoryStructureProviderService(SharedPropertiesService sharedPropertiesService) {
        this.sharedPropertiesService = sharedPropertiesService;
    }

    public String getStructure(String category) {
        return "Here goes " + category + " structure using serviceUrl: "
                + this.sharedPropertiesService.getServiceUrl("kb-service");
    }
}
