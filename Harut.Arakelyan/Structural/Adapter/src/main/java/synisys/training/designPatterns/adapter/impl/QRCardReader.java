package synisys.training.designPatterns.adapter.impl;

import synisys.training.designPatterns.adapter.api.WirelessCardReader;
import synisys.training.designPatterns.adapter.model.Card;

/**
 * @author harut.arakelyan
 */
public class QRCardReader implements WirelessCardReader {
    @Override
    public void readCard(Card card) {
        System.out.println("Card : " + card.getNumber() + " is reading with QR");
    }
}
