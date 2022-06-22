package src.main.java.com.synisys.api;

import java.util.List;

public interface Property {
    Property findFirstMatch(String key);

    List<Property> find(String key);

}
