package AbstractFactory.demo;

import AbstractFactory.BasketballSportFactory;
import AbstractFactory.FootballSportFactory;
import AbstractFactory.SportFactory;
import AbstractFactory.TennisSportFactory;
import AbstractFactory.model.Customer;
import AbstractFactory.model.SportCollection;

import java.util.ArrayList;
import java.util.List;

public class SportShopDemo {


    public static void main(String[] args) {

        SportFactory footballFactory = new FootballSportFactory();
        SportFactory tennisFactory = new TennisSportFactory();
        SportFactory basketballFactory = new BasketballSportFactory();


        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Heno", "football", 40, 41));
        customers.add(new Customer("Heno", "tennis", 38, 40));

        List<SportCollection> orders = new ArrayList<>();

        customers.forEach(customer -> {
            String sportType = customer.getSport();
            switch (sportType) {
                case "football":
                    orders.add(new SportCollection(
                            footballFactory.createShoes("Superfly", customer.getShoesSize()),
                            footballFactory.createClothing("Liverpool", customer.getClothingSize(), "red")
                    ));
                    break;
                case "tennis":
                    orders.add(new SportCollection(
                            tennisFactory.createShoes("Vapor Pro", customer.getShoesSize()),
                            tennisFactory.createClothing("Liverpool", customer.getClothingSize(), "white")
                    ));
                    break;
                case "basketball":
                    orders.add(new SportCollection(
                            basketballFactory.createShoes("Zoom", customer.getShoesSize()),
                            basketballFactory.createClothing("Liverpool", customer.getClothingSize(), "yellow")
                    ));
                    break;
            }
        });


    }


}
