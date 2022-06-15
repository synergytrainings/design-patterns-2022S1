package impl;

import api.SalesManager;

import java.util.ArrayList;
import java.util.List;

public class BridgeExample {

    public static void main(String[] args) {

        List<Client> clients = new ArrayList<>();
        Client client1 = new Client("John Smith", ContactMethod.EMAIL, "john.smith@gmail.com");
        Client client2 = new Client("Jane Smith", ContactMethod.FACEBOOK, "janesmithf111");
        clients.add(client1);
        clients.add(client2);
        final SalesManager manager = null;
        clients.stream().forEach(client -> {
            action(client, manager);
        });


    }

    public static void action(Client client, SalesManager manager) {
        ContactMethod contactMethod = client.getPreferredContactMethod();
        switch (contactMethod) {
            case SMS:
                manager = new SalesManagerImpl(new SMSSalesManagerImplementor());
                break;
            case EMAIL:
                manager = new SalesManagerImpl(new EmailSalesManagerImplementor());
                break;
            case FACEBOOK:
                manager = new SalesManagerImpl(new FacebookSalesManagerImplementor());
                break;
            default:
                System.out.println("Implementor not supported !!");
        }

        manager.notifyClients("some path");
        manager.placeOrder("item1", client);
    }

}
