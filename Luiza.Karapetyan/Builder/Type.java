package Builder;

public enum Type {

    SERIAL("serial"), MOVIE("movie");

    private String title;

    Type(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
