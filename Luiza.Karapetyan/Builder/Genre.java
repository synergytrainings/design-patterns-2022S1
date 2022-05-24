package Builder;

public enum Genre {

    COMEDY, FANTASY, DETECTIVE, DRAMA, CRIME;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
