package Observer;

public class LastSentNotification implements Observer {

    private String lastSentNotification;

    @Override
    public void subscribe(Object data) {
        if (data instanceof String) {
            this.lastSentNotification = (String) data;
        }
    }

    String getLastSentNotification() {
        return this.lastSentNotification;
    }
}
