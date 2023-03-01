package Facade.menu;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class BothMenu implements Menus {
    @Override
    public void getMenu() {
        try{
            File file = new File("Vigen.Vardanyan/Facade/images/restaurant_both_menu.jpg");
            Desktop.getDesktop().open(file);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
