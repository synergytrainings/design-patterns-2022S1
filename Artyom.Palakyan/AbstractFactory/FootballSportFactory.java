package AbstractFactory;

import AbstractFactory.model.*;

public class FootballSportFactory implements SportFactory {

    @Override
    public Shoes createShoes(String name, int size) {
        return new FootballShoes(name, size);
    }

    @Override
    public Clothing createClothing(String name, int size, String color) {
        return new FootballClothing(name, size, color);
    }
}
