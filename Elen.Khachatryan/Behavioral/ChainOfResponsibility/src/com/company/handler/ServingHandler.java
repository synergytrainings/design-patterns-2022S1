package com.company.handler;

public class ServingHandler extends CookingHandler{
    @Override
    public void handle() {
        System.out.println("Serving dish");
        System.out.println("Final handler: Dish is ready, enjoy!!!");
    }
}
