package Builder;

public enum Country {

    USA("United States"), EUROPE("Europe Union"), ASIA("Asia");

    private String title;

    Country(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}