package AbstractFactory;

import AbstractFactory.model.*;

public class BasketballSportFactory implements SportFactory{

    @Override
    public Shoes createShoes(String name, int size) {
        return new BasketballShoes(name, size);
    }

    @Override
    public Clothing createClothing(String name, int size, String color) {
        return new BasketballClothing(name, size, color);
    }

}
