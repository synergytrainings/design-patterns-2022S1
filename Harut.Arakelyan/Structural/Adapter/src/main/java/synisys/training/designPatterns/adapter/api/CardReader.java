package synisys.training.designPatterns.adapter.api;


import synisys.training.designPatterns.adapter.model.Card;

/**
 * @author harut.arakelyan
 */
public interface CardReader {
    public void readCard(Card card, String readingType);
}
