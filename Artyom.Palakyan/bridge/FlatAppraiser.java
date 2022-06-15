package bridge;

public class FlatAppraiser implements Appraiser {

    private double price;

    FlatAppraiser(double price) {
        this.price = price;
    }

    @Override
    public double estimate(double area) {
        return area * price;
    }


}
