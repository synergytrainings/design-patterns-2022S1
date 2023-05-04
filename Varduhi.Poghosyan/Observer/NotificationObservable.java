package Observer;

public class NotificationObservable extends Observable {

    void sendNotification(String notificationText) {
        this.notifyObservers(notificationText);
    }
}
