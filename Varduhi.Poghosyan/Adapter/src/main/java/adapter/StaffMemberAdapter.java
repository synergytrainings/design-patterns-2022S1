package src.main.java.adapter;

import src.main.java.classes.Client;
import src.main.java.classes.ItemPurchase;
import src.main.java.classes.StaffMember;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

public class StaffMemberAdapter extends Client {

    private StaffMember staffMember;
    private static Integer STAFF_DISCOUNT_PERCENT = 15;

    public StaffMemberAdapter(StaffMember staffMember) {
        super();
        this.setFirstName(staffMember.getFirstName());
        this.setLastName(staffMember.getLastName());
        this.staffMember = staffMember;
    }

    @Override
    public boolean addPurchase(ItemPurchase itemPurchase) {
        ItemPurchase newPurchase = Objects.nonNull(itemPurchase) ?
                new ItemPurchase(itemPurchase.getItemCode(), this.getDiscountedPrice(itemPurchase.getPrice())) : null;
        return super.addPurchase(newPurchase);
    }

    private BigDecimal getDiscountedPrice(BigDecimal price) {
        return BigDecimal.valueOf((100 - StaffMemberAdapter.STAFF_DISCOUNT_PERCENT)).multiply(price)
                .divide(BigDecimal.valueOf(100), RoundingMode.FLOOR);
    }
}
