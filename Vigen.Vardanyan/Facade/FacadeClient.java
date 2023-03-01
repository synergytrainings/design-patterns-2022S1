package Facade;

import Facade.menu.BothMenu;
import Facade.menu.NonVegMenu;
import Facade.menu.VegMenu;

public class FacadeClient {

    public static void main(String[] args) {
        RestaurantService restaurantService = new RestaurantServiceImpl();

        VegMenu vegMenu = restaurantService.getVegMenu();
//        vegMenu.getMenu();

        NonVegMenu nonVegMenu = restaurantService.getNonVegMenu();
//        nonVegMenu.getMenu();

        BothMenu both = restaurantService.getVegNonMenu();
        both.getMenu();

    }
}
