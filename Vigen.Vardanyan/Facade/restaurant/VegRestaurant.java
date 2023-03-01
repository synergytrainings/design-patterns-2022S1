package Facade.restaurant;

import Facade.menu.Menus;
import Facade.menu.VegMenu;

public class VegRestaurant implements Restaurant {
    public Menus getMenus() {
        return new VegMenu();
    }
}
