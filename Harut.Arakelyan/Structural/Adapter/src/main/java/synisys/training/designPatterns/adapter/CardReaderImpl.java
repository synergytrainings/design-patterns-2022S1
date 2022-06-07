package synisys.training.designPatterns.adapter;

import synisys.training.designPatterns.adapter.api.CardReader;
import synisys.training.designPatterns.adapter.model.Card;

import java.util.Objects;

/**
 * @author harut.arakelyan
 */
public class CardReaderImpl implements CardReader {
    CardReaderAdapter cardReaderAdapter;

    /**
     * @param card
     * @param readingType
     * @throws NullPointerException if card is null Or readingType is null or empty
     */
    @Override
    public void readCard(Card card, String readingType) {
        Objects.requireNonNull(card, "Card must not be null");
        if (readingType == null || readingType.trim().isEmpty()){
            throw new NullPointerException("readingType must not be null or empty");
        }
        if (readingType.equalsIgnoreCase("Standard")){
            System.out.println("Card : " + card.getNumber() + " is reading");
        }else{
            cardReaderAdapter = new CardReaderAdapter();
            cardReaderAdapter.readCard(card, readingType);
        }
    }
}
