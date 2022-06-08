package src.main.java.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Client extends User {

    private List<ItemPurchase> purchaseHistory = new ArrayList<>();

    public Client() {
    }

    public Client(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public boolean addPurchase(ItemPurchase itemPurchase) {
        if (Objects.nonNull(itemPurchase)) {
            return purchaseHistory.add(itemPurchase);
        } else {
            return false;
        }
    }

    public void showPurchaseHistory() {
        System.out.println(String.format("\nPurchases of %s %s:", this.getFirstName(), this.getLastName()));
        this.purchaseHistory.forEach(itemPurchase ->
                System.out.println(String.format("itemCode: %s; price: %s", itemPurchase.getItemCode(), itemPurchase.getPrice())));
    }

}
