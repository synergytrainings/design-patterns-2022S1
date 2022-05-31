package AbstractFactory.FruitTree;

public class Apricot implements FruitTree {
    @Override
    public void harvest() {
        System.out.println("Apricots are harvested in summer");
    }
}
