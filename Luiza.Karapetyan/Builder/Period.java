package Builder;

public enum Period {

    NINETIES, AUGHTS, NOWDAYS;

    @Override
    public String toString() {
        return name().toLowerCase();
    }

}