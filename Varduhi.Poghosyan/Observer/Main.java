package Observer;

public class Main {

    public static void main(String[] args) {
        NotificationObservable notificationObservable = new NotificationObservable();
        LastSentNotification lastSentNotification = new LastSentNotification();

        notificationObservable.subscribe(lastSentNotification);
        for (int i = 1; i <= 10; ++i) {
            notificationObservable.sendNotification(String.valueOf(i));
            System.out.println(lastSentNotification.getLastSentNotification());
        }
        notificationObservable.unsubscribe(lastSentNotification);
    }

}
