package main;

public class RCWithVoiceControl implements RemoteController {
    private String language = "english";

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public double moveUp(double y) {
        System.out.println("moving up through voice command in " + language);
        return y + 10;
    }

    @Override
    public double moveDown(double y) {
        System.out.println("moving down through voice command in " + language);
        return y - 10;
    }

    @Override
    public double moveRight(double x) {
        System.out.println("moving right through voice command in " + language);
        return x + 10;
    }

    @Override
    public double moveLeft(double x) {
        System.out.println("moving left through voice command in " + language);
        return x - 10;
    }
}
