package AbstractFactory;

import AbstractFactory.DecorativeTree.DecorativeTree;
import AbstractFactory.DecorativeTree.DecorativeTreeType;
import AbstractFactory.DecorativeTree.Fir;
import AbstractFactory.DecorativeTree.Poplar;
import AbstractFactory.FruitTree.FruitTree;
import AbstractFactory.FruitTree.FruitTreeType;

public class DecorativeTreeFactory extends TreeAbstractFactory {

    DecorativeTree getDecorativeTree(DecorativeTreeType type) {
        DecorativeTree tree = null;
        if (type != null) {
            switch (type) {
                case POPLAR:
                    tree = new Poplar();
                    break;
                case FIR:
                    tree = new Fir();
                    break;
            }
        }
        return tree;
    }

    FruitTree getFruitTree(FruitTreeType type) {
        return null;
    }
}
