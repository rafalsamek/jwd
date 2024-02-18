package interfaces.lab;

public class MP3Player extends MusicPlayer {
    public MP3Player(Song[] songs) {
        super(songs);
    }

    @Override
    public void play() {
        super.play();
        System.out.println("Gra odtwarzacz MP3");
    }
}
