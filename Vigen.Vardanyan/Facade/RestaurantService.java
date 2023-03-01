package Facade;

import Facade.menu.BothMenu;
import Facade.menu.NonVegMenu;
import Facade.menu.VegMenu;

public interface RestaurantService {
    VegMenu getVegMenu();

    NonVegMenu getNonVegMenu();

    BothMenu getVegNonMenu();
}
