package Arthur.Rafayelyan.Singleton;

import java.util.ArrayList;
import java.util.List;

public class ThreadSafeStore {
    private static volatile ThreadSafeStore instance;
    private static final List<String> items = new ArrayList<>();

    private ThreadSafeStore() {

    }

    public void addItem(String item) {
        items.add(item);
    }


    /**
     * Works fine and provides thread-safety
     * but it reduces the performance because of the cost associated with
     * the synchronized method
     * */
    public static synchronized ThreadSafeStore getInstance() {
        if (instance == null) {
            return new ThreadSafeStore();
        }
        return instance;
    }

    /**
     * getInstance using double-check locking
     * This approach not working with java 1.4 or below
     * */
    /*public static ThreadSafeStore getInstance() {
        if (instance == null) {
            synchronized (ThreadSafeStore.class) {
                if (instance == null) {
                    return new ThreadSafeStore();
                }
            }
        }
        return instance;
    }*/

    public List<String> getItems() {
        return items;
    }
}
