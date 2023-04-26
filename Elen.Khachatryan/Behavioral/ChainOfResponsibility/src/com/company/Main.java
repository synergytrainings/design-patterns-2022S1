package com.company;

import com.company.handler.*;

public class Main {
    public static void main(String[] args) {
        CookingHandler washingHandler = new WashingHandler();
        CookingHandler cuttingHandler = new CuttingHandler();
        CookingHandler bakingHandler = new BakingHandler();
        CookingHandler servingHandler = new ServingHandler();
        washingHandler.setNextHandler(cuttingHandler);
        cuttingHandler.setNextHandler(bakingHandler);
        bakingHandler.setNextHandler(servingHandler);

        washingHandler.handle();
    }
}
