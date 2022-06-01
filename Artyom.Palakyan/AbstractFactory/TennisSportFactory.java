package AbstractFactory;

import AbstractFactory.model.*;

public class TennisSportFactory implements SportFactory {

    @Override
    public Shoes createShoes(String name, int size) {
        return new TennisShoes(name, size);
    }

    @Override
    public Clothing createClothing(String name, int size, String color) {
        return new TennisClothing(name, size, color);
    }
}
