package services;

import java.util.HashMap;
import java.util.Map;

public class SharedPropertiesService {

    private final Map<String, String> serviceToUrlMapping;

    public SharedPropertiesService(String source) {
        this.serviceToUrlMapping = new HashMap<String, String>();
        this.setServiceUrls(source);
    }

    private void setServiceUrls(String source) {
        // should use source to retrieve url
        this.serviceToUrlMapping.put("kb-service", "http://testenv.com/kb-service");
    }

    public String getServiceUrl(String service) {
        return this.serviceToUrlMapping.get(service);
    }

}
