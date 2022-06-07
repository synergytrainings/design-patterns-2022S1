package synisys.training.designPatterns.adapter;

import synisys.training.designPatterns.adapter.api.CardReader;
import synisys.training.designPatterns.adapter.api.WirelessCardReader;
import synisys.training.designPatterns.adapter.impl.NFCCardReader;
import synisys.training.designPatterns.adapter.impl.QRCardReader;
import synisys.training.designPatterns.adapter.model.Card;

/**
 * @author harut.arakelyan
 */
public class CardReaderAdapter implements CardReader {
    WirelessCardReader wirelessCardReader;

    /**
     * @param card
     * @param readingType
     * @throws IllegalArgumentException if readingType is not NFC or QR
     */
    @Override
    public void readCard(Card card, String readingType) {
        switch (readingType.trim()){
            case "NFC" :
                this.wirelessCardReader = new NFCCardReader();
                break;
            case "QR":
                this.wirelessCardReader = new QRCardReader();
                break;
            default:
                throw new IllegalArgumentException(
                        String.format("CardReader for type %s is not implemented.", readingType));
        }
        this.wirelessCardReader.readCard(card);
    }
}
