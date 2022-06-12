package test;


import main.BasicRC;
import main.DJIDrone;
import main.DJIMavic;

public class TestBridge {
    public static void main(String[] args) {
        DJIDrone mavic = new DJIMavic(new BasicRC());
        mavic.flyAndShoot();

    }
}
