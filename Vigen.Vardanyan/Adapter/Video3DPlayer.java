package Adapter;

public class Video3DPlayer implements AdvancedMediaPlayer {
    @Override
    public void playMp4(String fileName) {

    }

    @Override
    public void play3DVideo(String fileName) {
        System.out.println("Playing 3D video file. File name is " + fileName);
    }
}
