package com.synisys.singleton;

public class Demo {
    public static void main(String[] args) {
        Genie genie = Genie.INSTANCE;

        genie.listenForWish("I wish to find more Genies");
        System.out.println(genie.getWishCount());

        Genie anotherGenie = Genie.INSTANCE;
        anotherGenie.listenForWish("Genie, I wish for you to make me a prince");
        System.out.println(anotherGenie.getWishCount());

        genie.listenForWish("I wish for your freedom");
        System.out.println(genie.getWishCount());

        anotherGenie.listenForWish("I wish to have more wishes.");
        System.out.println(genie.getWishCount());
    }
}
