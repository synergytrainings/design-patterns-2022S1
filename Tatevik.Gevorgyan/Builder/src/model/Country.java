package model;

public class Country {

    public String name;

    public Integer population;

    public Integer area;

    public City capital;

    public static class Builder extends BaseBuilder<Builder> {

        public BaseBuilder<?> capital(City value) {
            super.capital = value;
            return this;
        }

    }

    public abstract static class BaseBuilder<T extends BaseBuilder<T>> {

        private String name;

        private Integer population;

        private Integer area;

        private City capital;

        public T name(String value) {
            name = value;
            return self();
        }

        public T population(Integer value) {
            population = value;
            return self();
        }

        public T area(Integer value) {
            area = value;
            return self();
        }

        public Country build() {
            return new Country(this);
        }

        @SuppressWarnings("unchecked")
        public T self() {
            return (T) this;
        }
    }

    private Country(BaseBuilder<?> builder) {
        name = builder.name;
        area = builder.area;
        population = builder.population;
        capital = builder.capital;
    }

    @Override
    public String toString() {
        return "model.Country{" +
                "name='" + name + '\'' +
                ", capital=" + capital.name +
                ", population=" + population +
                ", area=" + area +
                '}';
    }
}
