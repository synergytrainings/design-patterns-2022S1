package main;

public class DJIFpv extends DJIDrone {

    private boolean isAutoTrackOn;

    public DJIFpv(RemoteController remoteController) {
        super(remoteController);
        setMaxHeight(1000);
    }

    @Override
    public void flyAndShoot() {
        System.out.println("DJI FPV flight started");
        while (getyCoordinate() < getMaxHeight()) {
            setyCoordinate(remoteController.moveUp(getyCoordinate()));
        }
        System.out.println("DJI FPV is shooting from the highest point");
        while (getyCoordinate() > 0) {
            setyCoordinate(remoteController.moveDown(getyCoordinate()));
        }
        System.out.println("DJI FPV returned");
    }

    @Override
    public void flyOverAndShoot(double length) {
        System.out.println("DJI FPV fly-over flight started");
        while (getyCoordinate() < getMaxHeight()) {
            setyCoordinate(remoteController.moveUp(getyCoordinate()));
        }
        while (getxCoordinate() < length) {
            setxCoordinate(remoteController.moveLeft(getxCoordinate()));
        }
        while (getxCoordinate() > -length) {
            setxCoordinate(remoteController.moveRight(getxCoordinate()));
        }
        while (getxCoordinate() < 0) {
            setxCoordinate(remoteController.moveLeft(getxCoordinate()));
        }
        System.out.println("DJI FPV is shooting from the highest point");
        while (getyCoordinate() > 0) {
            setyCoordinate(remoteController.moveDown(getyCoordinate()));
        }
        System.out.println("DJI FPV returned");
    }

    public boolean isAutoTrackOn() {
        return isAutoTrackOn;
    }

    public void setAutoTrackOn(boolean autoTrackOn) {
        isAutoTrackOn = autoTrackOn;
    }
}
