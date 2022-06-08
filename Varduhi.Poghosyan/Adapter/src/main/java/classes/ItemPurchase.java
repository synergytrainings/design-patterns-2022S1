package src.main.java.classes;

import java.math.BigDecimal;

public class ItemPurchase {
    private String itemCode;
    // price in dollars
    private BigDecimal price;

    public ItemPurchase(String itemCode,  BigDecimal price) {
        this.itemCode = itemCode;
        this.price = price;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
