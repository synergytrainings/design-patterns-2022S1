package adapter.impl;

import adapter.api.ViberClient;

public class ViberClientImpl implements ViberClient {

    private String apiKey;

    private String fromAddress;

    public ViberClientImpl(String apiKey, String fromAddress) {
        this.apiKey = apiKey;
        this.fromAddress = fromAddress;
    }


    @Override
    public void sendMessage(String address, String message) {
        System.out.print("Send to viber");
        //send message
    }



}
