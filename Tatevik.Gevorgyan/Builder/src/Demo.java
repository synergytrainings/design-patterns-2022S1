import model.City;
import model.Country;

public class Demo {
    public static void main(String[] args) {

        Country countyArmenia = new Country.Builder()
                .name("Armenia")
                .capital(new City("Yerevan"))
                .population(3000000)
                .area(30000)
                .build();

        System.out.println(countyArmenia);

    }
}
