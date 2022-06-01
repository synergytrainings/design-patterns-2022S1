package AbstractFactory;

import AbstractFactory.model.Clothing;
import AbstractFactory.model.Shoes;

public interface SportFactory {

    Shoes createShoes(String name, int size);

    Clothing createClothing(String name, int size, String color);

}
