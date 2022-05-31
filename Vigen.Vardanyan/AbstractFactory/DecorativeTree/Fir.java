package AbstractFactory.DecorativeTree;

public class Fir implements DecorativeTree {
    @Override
    public void grow() {
        System.out.println("Firs are always green.");
    }
}
