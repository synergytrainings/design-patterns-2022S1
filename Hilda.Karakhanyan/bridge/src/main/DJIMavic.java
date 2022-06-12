package main;

public class DJIMavic extends DJIDrone {

    public boolean isObstacleRecognitionOn() {
        return obstacleRecognitionOn;
    }

    public void setObstacleRecognitionOn(boolean obstacleRecognitionOn) {
        this.obstacleRecognitionOn = obstacleRecognitionOn;
    }

    private boolean obstacleRecognitionOn;

    public DJIMavic(RemoteController remoteController) {
        super(remoteController);
    }

    @Override
    public void flyAndShoot() {
        System.out.println("DJI Mavic flight started");
        while (getyCoordinate() < getMaxHeight()) {
            setyCoordinate(remoteController.moveUp(getyCoordinate()));
        }
        System.out.println("DJI Mavic is shooting from the highest point");
        while (getyCoordinate() > 0) {
            setyCoordinate(remoteController.moveDown(getyCoordinate()));
        }
        System.out.println("DJI Mavic returned");
    }

    @Override
    public void flyOverAndShoot(double length) {
        System.out.println("DJI Mavic fly-over flight started");
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
        while (getyCoordinate() > 0) {
            setyCoordinate(remoteController.moveDown(getyCoordinate()));
        }
        System.out.println("DJI Mavic returned");
    }

}
