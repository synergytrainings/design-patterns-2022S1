package adapter.impl;

import adapter.api.MailClient;

public class MailClientImpl implements MailClient {

    private String apiKey;

    private String domain;

    private String fromAddress;

    MailClientImpl(String apiKey, String domain, String fromAddress) {
        this.apiKey = apiKey;
        this.domain = domain;
        this.fromAddress = fromAddress;
    }


    @Override
    public void sendMail(String address, String message) {

    }
}
