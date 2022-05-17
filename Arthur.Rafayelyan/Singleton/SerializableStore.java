package Arthur.Rafayelyan.Singleton;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SerializableStore implements Serializable {
    public static SerializableStore instance = new SerializableStore();
    private final List<String> items = new ArrayList<>();


    private SerializableStore() {

    }

    public void addItem(String item) {
        items.add(item);
    }

    public List<String> getItems() {
        return items;
    }

    protected Object readResolve()
    {
        return instance;
    }

}
