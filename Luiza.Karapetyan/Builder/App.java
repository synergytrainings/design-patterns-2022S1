package Builder;

public class App {

    public static void main(String[] args) {

        Film gentlemen =
                new Film.Builder(Genre.CRIME, "Gentlemen").withType(Type.MOVIE)
                        .withCountry(Country.EUROPE).withProduction(Production.MIRAMAX).build();
        System.out.println(gentlemen);

        Film lucifer =
                new Film.Builder(Genre.FANTASY, "Lucifer").withType(Type.SERIAL)
                        .withCountry(Country.USA).withPeriod(Period.NOWDAYS).build();
        System.out.println(lucifer);



    }
}
