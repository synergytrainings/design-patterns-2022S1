package Adapter;

public class MediaPlayerAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaPlayerAdapter(AudioTypeEnum audioType) {
        if (audioType.equals(AudioTypeEnum.MP4)) {
            advancedMediaPlayer = new Mp4Player();
        } else if (audioType.equals(AudioTypeEnum.VIDEO_3D)) {
            advancedMediaPlayer = new Video3DPlayer();
        }
    }

    @Override
    public void play(AudioTypeEnum audioType, String fileName) {
        switch (audioType) {
            case MP4:
                advancedMediaPlayer.playMp4(fileName);
                break;
            case VIDEO_3D:
                advancedMediaPlayer.play3DVideo(fileName);
                break;
            default:
                throw new IllegalArgumentException(
                        String.format("Audio type %s is not supported.", audioType));
        }
    }
}
