package AbstractFactory;

public class FactoryProvider {
    public static TreeAbstractFactory getFactory(TreeType type) {
        TreeAbstractFactory factory = null;
        if (type != null) {
            switch (type) {
                case FRUIT:
                    factory = new FruitTreeFactory();
                    break;
                case DECORATIVE:
                    factory = new DecorativeTreeFactory();
                    break;
            }
        }
        return factory;
    }
}
