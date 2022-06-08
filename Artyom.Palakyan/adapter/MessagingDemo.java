package adapter;

import adapter.impl.MessagingAdapterImpl;
import adapter.impl.ViberClientImpl;

public class MessagingDemo {

    public static void main(String[] args) {

        ViberClientImpl viberClient = new ViberClientImpl("sfdgsfdsdf", "+37477787887");
        MessagingAdapterImpl messagingAdapter = new MessagingAdapterImpl("ddfgdfs",
                "gmail.com", "demo@gmail.com", viberClient);

        messagingAdapter.sendMessage("VIBER", "+37477323223", "Hello");




    }


}
