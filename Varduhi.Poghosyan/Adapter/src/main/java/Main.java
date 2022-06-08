package src.main.java;

import src.main.java.adapter.StaffMemberAdapter;
import src.main.java.classes.Client;
import src.main.java.classes.ItemPurchase;
import src.main.java.classes.StaffMember;

import java.math.BigDecimal;

public class Main {

    public static void main(String args[]) {
        ItemPurchase purchase = new ItemPurchase("PHONE00X", BigDecimal.valueOf(1200));

        Client amanda = new Client("Amanda", "Moore");
        amanda.addPurchase(purchase);
        amanda.showPurchaseHistory();

        StaffMember john = new StaffMember("John", "Moore", 1200, "SMM specialist");
        StaffMemberAdapter staffMemberThatCanDoPurchases = new StaffMemberAdapter(john);
        staffMemberThatCanDoPurchases.addPurchase(purchase);
        staffMemberThatCanDoPurchases.showPurchaseHistory();
    }
}
