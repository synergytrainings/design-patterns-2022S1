package Builder;

public final class Film {

    private final Genre genre;
    private final String name;
    private final Type type;
    private final Period period;
    private final Country country;
    private final Production production;

    private Film(Builder builder) {
        this.genre = builder.genre;
        this.name = builder.name;
        this.country = builder.country;
        this.type = builder.type;
        this.production = builder.production;
        this.period = builder.period;
    }

    public Genre getGenre() {
        return genre;
    }

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    public Period getPeriod() {
        return period;
    }

    public Country getCountry() {
        return country;
    }

    public Production getProduction() {
        return production;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append(name);
        if (type != null) {
         sb.append(type != Type.SERIAL ? " Movie" : " Serial");

        }
        if (type != null) {
               sb.append(" is in ")
                .append(genre)
                .append(" genre ");}
        if (country != null || period != null) {
            if (country != null) {
               sb.append("filmed in ")
               .append(country).append(' ');
            }
            if (period != null) {
                sb.append("in ")
                .append(period).append(' ');
            }
        }
        if (production != null) {
            sb.append("by ").append(production);
        }

        sb.append('.');
        return sb.toString();
    }

    /**
     *
     * The builder class.
     *
     */
    public static class Builder {

        private final Genre genre;
        private final String name;
        private Type type;
        private Period period;
        private Country country;
        private Production production;


        public Builder(Genre genre, String name) {
            if (genre == null || name == null) {
                throw new IllegalArgumentException("profession and name can not be null");
            }
            this.genre = genre;
            this.name = name;
        }

        public Builder withType(Type type) {
            this.type = type;
            return this;
        }

        public Builder withPeriod(Period period) {
            this.period = period;
            return this;
        }

        public Builder withCountry(Country country) {
            this.country = country;
            return this;
        }

        public Builder withProduction(Production production) {
            this.production = production;
            return this;
        }

        public Film build() {
            return new Film(this);
        }
    }
}