package AbstractFactory.model;

public class Customer {

    private String name;
    private String sport;
    private int clothingSize;
    private int shoesSize;

    public Customer(String name, String sport, int clothingSize, int shoesSize) {
        this.name = name;
        this.sport = sport;
        this.clothingSize = clothingSize;
        this.shoesSize = shoesSize;
    }

    public String getName() {
        return name;
    }

    public String getSport() {
        return sport;
    }

    public int getClothingSize() {
        return clothingSize;
    }

    public int getShoesSize() {
        return shoesSize;
    }
}
