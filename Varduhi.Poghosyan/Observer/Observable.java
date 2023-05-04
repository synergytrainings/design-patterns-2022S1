package Observer;

import java.util.ArrayList;
import java.util.List;

public class Observable {

    private final List<Observer> observers = new ArrayList<>();

    void subscribe(Observer observer) {
        this.observers.add(observer);
    }

    void unsubscribe(Observer channel) {
        this.observers.remove(channel);
    }

    void notifyObservers(Object data) {
        this.observers.forEach(observer -> observer.subscribe(data));
    }
}
