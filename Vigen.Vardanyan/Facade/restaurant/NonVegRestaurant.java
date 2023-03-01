package Facade.restaurant;

import Facade.menu.Menus;
import Facade.menu.NonVegMenu;

public class NonVegRestaurant implements Restaurant {
    public Menus getMenus() {
        return new NonVegMenu();
    }
}
