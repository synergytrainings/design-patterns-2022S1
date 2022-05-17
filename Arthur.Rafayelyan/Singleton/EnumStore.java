package Arthur.Rafayelyan.Singleton;

import java.util.ArrayList;
import java.util.List;

public enum EnumStore {
    INSTANCE;
    final List<String> items = new ArrayList<>();

    public void addItem(String item) {
        items.add(item);
    }

    public List<String> getItems() {
        return items;
    }
}
