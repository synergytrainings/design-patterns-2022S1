package synisys.training.designPatterns.builder.example1.bakeryIngredients;

import synisys.training.designPatterns.builder.example1.Bakery;

/**
 * @author harut.arakelyan
 */
public interface Yeast {
    Bakery.BakeryBuilder addYeast(double yeast);
}
