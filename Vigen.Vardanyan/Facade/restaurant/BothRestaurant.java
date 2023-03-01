package Facade.restaurant;

import Facade.menu.BothMenu;
import Facade.menu.Menus;

public class BothRestaurant implements Restaurant {
    public Menus getMenus() {
        return new BothMenu();
    }
}
