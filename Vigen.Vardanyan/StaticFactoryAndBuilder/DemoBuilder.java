import builder.AlcoholicDrink;
import builder.Whiskey;
import factory.AbstractFactory;
import factory.EnumWineType;
import factory.WineFactory;

public class DemoBuilder {

    public static void main(String[] args) {
        AbstractFactory factory = new WineFactory();
        AlcoholicDrink redWine = factory.getWine(EnumWineType.RED);
        AlcoholicDrink whiteWine = factory.getWine(EnumWineType.WHITE);

        AlcoholicDrink whiskey = new Whiskey();

        redWine.prepare();
        redWine.drink();
        System.out.println("Wine degree: " + redWine.degree());
        System.out.println("Wine sweetness: " + redWine.sweetness());

        whiteWine.prepare();
        whiteWine.drink();
        System.out.println("Wine degree: " + whiteWine.degree());
        System.out.println("Wine sweetness: " + whiteWine.sweetness());

        whiskey.prepare();
        whiskey.drink();
        System.out.println("Whiskey degree: " + whiskey.degree());
    }
}
