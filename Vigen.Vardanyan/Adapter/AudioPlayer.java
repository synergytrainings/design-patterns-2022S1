package Adapter;

public class AudioPlayer implements MediaPlayer {
    MediaPlayerAdapter mediaPlayerAdapter;

    @Override
    public void play(AudioTypeEnum audioType, String fileName) {
        if (audioType.equals(AudioTypeEnum.MP3)) {
            System.out.println("Playing mp3 file. File name is " + fileName);
        } else {
            mediaPlayerAdapter = new MediaPlayerAdapter(audioType);
            mediaPlayerAdapter.play(audioType, fileName);
        }
    }
}
