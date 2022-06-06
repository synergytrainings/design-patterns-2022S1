package Adapter;

public class Mp4Player implements AdvancedMediaPlayer {

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. File name is " + fileName);
    }

    @Override
    public void play3DVideo(String fileName) {

    }
}
