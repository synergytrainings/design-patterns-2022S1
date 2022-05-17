package Arthur.Rafayelyan.Singleton;

import java.util.ArrayList;
import java.util.List;

public class EagerInitializedStore {
    private static final EagerInitializedStore instance = new EagerInitializedStore();
    private static final List<String> items = new ArrayList<>();

    private EagerInitializedStore() {

    }

    public void addItem(String item) {
        items.add(item);
    }

    public static EagerInitializedStore getInstance() {
        return instance;
    }

    public List<String> getItems() {
        return items;
    }

}
