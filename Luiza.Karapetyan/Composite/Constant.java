package Composite;

public class Constant implements Expression {
    private int number;

    public Constant(int number) {
        this.number = number;
    }

    public int computeValue() {
        return number;
    }

    public String getAsString() {
        return String.valueOf(number);
    }

}
