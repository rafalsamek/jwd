package interfaces.lab;

public class CDPlayer extends MusicPlayer {
    public CDPlayer(Song[] songs) {
        super(songs);
    }

    @Override
    public void play() {
        super.play();
        System.out.println("Gra odtwarzacz CD");
    }
}
