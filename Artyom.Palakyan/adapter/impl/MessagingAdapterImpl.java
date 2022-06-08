package adapter.impl;

public class MessagingAdapterImpl extends MailClientImpl {

    ViberClientImpl viberClient;

    public MessagingAdapterImpl(String apiKey,
                                String domain,
                                String fromAddress,
                                ViberClientImpl viberClient) {
        super(apiKey, domain, fromAddress);
        this.viberClient = viberClient;
    }

    @Override
    public void sendMail(String address, String message) {
        // send message
    }

    public void sendMessage(String messageType,
                            String address,
                            String message) {
        switch (messageType) {
            case "MAIL":
                sendMail(address, message);
                break;
            case "VIBER":
                viberClient.sendMessage(address, message);
                break;
            default:
                throw new IllegalArgumentException("Not supported message type");
        }
    }


}
