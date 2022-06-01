package AbstractFactory.model;

public class SportCollection {

    public Shoes shoes;
    public Clothing clothing;

    public SportCollection(Shoes shoes, Clothing clothing) {
        this.shoes = shoes;
        this.clothing = clothing;
    }
}
