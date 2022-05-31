package AbstractFactory;

import AbstractFactory.DecorativeTree.DecorativeTree;
import AbstractFactory.DecorativeTree.DecorativeTreeType;
import AbstractFactory.FruitTree.*;

public class FruitTreeFactory extends TreeAbstractFactory {

    DecorativeTree getDecorativeTree(DecorativeTreeType type) {
        return null;
    }

    FruitTree getFruitTree(FruitTreeType type) {
        FruitTree tree = null;
        if (type != null) {
            switch (type) {
                case APPLE:
                    tree = new Apple();
                    break;
                case PEAR:
                    tree = new Pear();
                    break;
                case APRICOT:
                    tree = new Apricot();
                    break;
            }
        }
        return tree;
    }
}
