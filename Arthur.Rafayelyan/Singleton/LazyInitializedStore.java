package Arthur.Rafayelyan.Singleton;

import java.util.ArrayList;
import java.util.List;

public class LazyInitializedStore {
    private static LazyInitializedStore instance;
    private static final List<String> items = new ArrayList<>();

    private LazyInitializedStore() {

    }

    public void addItem(String item) {
        items.add(item);
    }

    public static LazyInitializedStore getInstance() {
        if (instance == null) {
            instance = new LazyInitializedStore();
            return instance;
        }
        return instance;
    }

    public List<String> getItems() {
        return items;
    }
}
