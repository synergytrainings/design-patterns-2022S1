package Facade;

import Facade.menu.BothMenu;
import Facade.menu.NonVegMenu;
import Facade.menu.VegMenu;
import Facade.restaurant.BothRestaurant;
import Facade.restaurant.NonVegRestaurant;
import Facade.restaurant.VegRestaurant;

public class RestaurantServiceImpl implements RestaurantService {
    @Override
    public VegMenu getVegMenu() {
        VegRestaurant vegRestaurant = new VegRestaurant();
        return (VegMenu) vegRestaurant.getMenus();
    }

    @Override
    public NonVegMenu getNonVegMenu() {
        NonVegRestaurant nonVegRestaurant = new NonVegRestaurant();
        return (NonVegMenu) nonVegRestaurant.getMenus();
    }

    @Override
    public BothMenu getVegNonMenu() {
        BothRestaurant bothRestaurant = new BothRestaurant();
        return (BothMenu) bothRestaurant.getMenus();
    }
}
