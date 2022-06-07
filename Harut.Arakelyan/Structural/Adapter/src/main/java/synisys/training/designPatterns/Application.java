package synisys.training.designPatterns;

import synisys.training.designPatterns.adapter.CardReaderImpl;
import synisys.training.designPatterns.adapter.api.CardReader;
import synisys.training.designPatterns.adapter.model.Card;

/**
 * @author harut.arakelyan
 */
public class Application {

    public static void main(String[] args) {
        Card card = new Card("5577 8900 9890 8988", "ARAKELYAN HARUT");
        CardReader cardReader = new CardReaderImpl();
        cardReader.readCard(card,"Standard");
        cardReader.readCard(card,"NFC");
        cardReader.readCard(card,"QR");
    }
}
