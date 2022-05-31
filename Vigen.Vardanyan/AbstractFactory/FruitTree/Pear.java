package AbstractFactory.FruitTree;

public class Pear implements FruitTree {
    @Override
    public void harvest() {
        System.out.println("Pears are harvested in autumn");
    }
}
