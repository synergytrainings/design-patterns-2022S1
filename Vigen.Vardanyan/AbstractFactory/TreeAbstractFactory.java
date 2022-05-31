package AbstractFactory;

import AbstractFactory.DecorativeTree.DecorativeTree;
import AbstractFactory.DecorativeTree.DecorativeTreeType;
import AbstractFactory.FruitTree.FruitTree;
import AbstractFactory.FruitTree.FruitTreeType;

public abstract class TreeAbstractFactory {
    abstract DecorativeTree getDecorativeTree(DecorativeTreeType type);

    abstract FruitTree getFruitTree(FruitTreeType type);
}
