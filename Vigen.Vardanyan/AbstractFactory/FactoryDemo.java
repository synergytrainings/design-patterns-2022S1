package AbstractFactory;

import AbstractFactory.DecorativeTree.DecorativeTree;
import AbstractFactory.DecorativeTree.DecorativeTreeType;
import AbstractFactory.FruitTree.FruitTree;
import AbstractFactory.FruitTree.FruitTreeType;

public class FactoryDemo {

    public static void main(String[] args) {
        TreeAbstractFactory fruitTreeFactory = FactoryProvider.getFactory(TreeType.FRUIT);
        FruitTree apple = fruitTreeFactory.getFruitTree(FruitTreeType.APPLE);
        apple.harvest();
        FruitTree pear = fruitTreeFactory.getFruitTree(FruitTreeType.PEAR);
        pear.harvest();
        FruitTree apricot = fruitTreeFactory.getFruitTree(FruitTreeType.APRICOT);
        apricot.harvest();

        TreeAbstractFactory decorativeTreeFactory = FactoryProvider.getFactory(TreeType.DECORATIVE);
        DecorativeTree poplar = decorativeTreeFactory.getDecorativeTree(DecorativeTreeType.POPLAR);
        poplar.grow();
        DecorativeTree fir = decorativeTreeFactory.getDecorativeTree(DecorativeTreeType.FIR);
        fir.grow();

    }
}
