package src.main.java.com.synisys;

import src.main.java.com.synisys.api.Property;
import src.main.java.com.synisys.impl.Properties;
import src.main.java.com.synisys.impl.SingleProperty;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Property> propertiesList = new ArrayList<>();
        Property property1 = new SingleProperty<>("key", "value");
        propertiesList.add(property1);
        Property property2 = new SingleProperty<>("key1", "value45");
        Property property3 = new SingleProperty<>("key", "value45");
        Property property4 = new SingleProperty<>("key", "value4485");
        propertiesList.add(property3);
        propertiesList.add(property4);

        propertiesList.add(new Properties(Collections.singletonList(property2)));
        Property property = new Properties(propertiesList);
        System.out.println(property.toString());
        System.out.println(property.find("key"));
        System.out.println(property1.find("key"));
    }
}

