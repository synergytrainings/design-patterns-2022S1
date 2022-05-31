package AbstractFactory.FruitTree;

public class Apple implements FruitTree {
    @Override
    public void harvest() {
        System.out.println("Apples are harvested in autumn");
    }
}
