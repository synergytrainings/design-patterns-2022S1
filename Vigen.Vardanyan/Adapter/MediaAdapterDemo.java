package Adapter;

public class MediaAdapterDemo {
    public static void main(String[] args) {
        AudioPlayer player = new AudioPlayer();
        player.play(AudioTypeEnum.MP3, "music.mp3");
        player.play(AudioTypeEnum.MP4, "video.mp4");
        player.play(AudioTypeEnum.VIDEO_3D, "3DVideo.vmm");
    }
}
