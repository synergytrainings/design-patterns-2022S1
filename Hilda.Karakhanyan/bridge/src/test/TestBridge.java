package test;


import main.*;

public class TestBridge {
    public static void main(String[] args) {
        DJIDrone mavic = new DJIMavic(new BasicRC());
        mavic.flyAndShoot();
        System.out.println();

        DJIDrone mavicWithAdvancedRC = new DJIMavic(new RCWithVoiceControl());
        mavicWithAdvancedRC.flyAndShoot();
        System.out.println();

        DJIDrone fpv = new DJIFpv(new BasicRC());
        fpv.flyOverAndShoot(10);
        System.out.println();

        DJIDrone fpvWithAdvancedRC = new DJIFpv(new RCWithVoiceControl());
        fpvWithAdvancedRC.flyOverAndShoot(10);
        System.out.println();

    }
}
