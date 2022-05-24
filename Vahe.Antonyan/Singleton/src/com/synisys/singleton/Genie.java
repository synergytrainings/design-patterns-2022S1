package com.synisys.singleton;
public enum Genie {
    INSTANCE;

    private int wishCount = 3;

    public void listenForWish(String wish) {
        System.out.println("You wished for: " + wish);
        if(wishCount > 0){
            wishCount--;
            System.out.println("Wish no more.");
            // Make the wish happen.
        } else {
            System.out.println("No more wishes.");
        }
    }

    public int getWishCount() {
        return wishCount;
    }
}