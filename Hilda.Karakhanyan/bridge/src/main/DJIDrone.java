package main;

public abstract class DJIDrone {

    private int resolution;
    private int framesPerSecond;
    private int maxHeight;

    private double xCoordinate = 0;
    private double yCoordinate = 0;

    protected RemoteController remoteController;

    public DJIDrone(RemoteController remoteController) {
        this.remoteController = remoteController;
    }

    public abstract void flyAndShoot();

    public abstract void flyOverAndShoot(double length);

    public int getResolution() {
        return resolution;
    }

    public void setResolution(int resolution) {
        this.resolution = resolution;
    }

    public int getFramesPerSecond() {
        return framesPerSecond;
    }

    public void setFramesPerSecond(int framesPerSecond) {
        this.framesPerSecond = framesPerSecond;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public void setMaxHeight(int maxHeight) {
        this.maxHeight = maxHeight;
    }

    public double getxCoordinate() {
        return xCoordinate;
    }

    public void setxCoordinate(double xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public double getyCoordinate() {
        return yCoordinate;
    }

    public void setyCoordinate(double yCoordinate) {
        this.yCoordinate = yCoordinate;
    }
}
