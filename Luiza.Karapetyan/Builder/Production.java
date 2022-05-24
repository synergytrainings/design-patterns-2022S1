package Builder;

public enum Production {

    NETFLIX, HBO, WARNER, TWENTY_FOX, MARVEL, MIRAMAX;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
