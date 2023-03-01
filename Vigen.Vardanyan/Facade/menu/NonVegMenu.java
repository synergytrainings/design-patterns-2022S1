package Facade.menu;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class NonVegMenu implements Menus {
    @Override
    public void getMenu() {
        try{
            File file = new File("Vigen.Vardanyan/Facade/images/restaurant_non_veg_menu.jpg");
            Desktop.getDesktop().open(file);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
