package main;

public class BasicRC implements RemoteController {

    @Override
    public double moveUp(double y) {
        System.out.println("moving up by clicking UP button");
        return y + 10;
    }

    @Override
    public double moveDown(double y) {
        System.out.println("moving dow by clicking DOWN button");
        return y - 10;
    }

    @Override
    public double moveRight(double x) {
        System.out.println("moving right by clicking RIGHT button");
        return x + 10;
    }

    @Override
    public double moveLeft(double x) {
        System.out.println("moving left by clicking LEFT button");
        return x - 10;
    }

}
