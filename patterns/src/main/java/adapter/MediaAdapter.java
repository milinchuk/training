package adapter;

/**
 * Created by click on 11/28/2016.
 */
public class MediaAdapter implements MediaPlayer {
    private AdvancedMediaPlayer advancedMusicPlayer;

    public AdvancedMediaPlayer getAdvancedMusicPlayer() {
        return advancedMusicPlayer;
    }

    public void setAdvancedMusicPlayer(AdvancedMediaPlayer advancedMusicPlayer) {
        this.advancedMusicPlayer = advancedMusicPlayer;
    }

    public MediaAdapter(String audioType){

        if(audioType.equalsIgnoreCase("vlc") ){
            advancedMusicPlayer = new VlcPlayer();

        }else if (audioType.equalsIgnoreCase("mp4")){
            advancedMusicPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {

        if(audioType.equalsIgnoreCase("vlc")){
            advancedMusicPlayer.playVlc(fileName);
        }
        else if(audioType.equalsIgnoreCase("mp4")){
            advancedMusicPlayer.playMp4(fileName);
        }
    }
}
