package bridge;

public class HouseAppraiser implements Appraiser {

    private double price;

    HouseAppraiser(double price) {
        this.price = price;
    }

    @Override
    public double estimate(double area) {
        return area * price;
    }


}
