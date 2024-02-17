package interfaces.lab;

public class StreamerPlayer extends MusicPlayer {
    public StreamerPlayer(Song[] songs) {
        super(songs);
    }

    @Override
    public void play() {
        super.play();
        System.out.println("Gra odtwarzacz Streamer");
    }
}
