package synisys.training.designPatterns.adapter.model;

/**
 * @author harut.arakelyan
 */
public class Card {

    private String number;
    private String owner;

    public Card(String number, String owner) {
        this.number = number;
        this.owner = owner;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
