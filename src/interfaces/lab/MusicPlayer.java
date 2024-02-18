package interfaces.lab;

public abstract class MusicPlayer implements Player {
    protected Song[] songs;
    protected int currentSongIndex = 0;

    public MusicPlayer(Song[] songs) {
        this.songs = songs;
    }

    @Override
    public void play() {
        System.out.println(this.getCurrentSong());
    }

    @Override
    public void pause() {
        System.out.println("Pauza");
    }

    @Override
    public void stop() {
        System.out.println("Stop");
    }

    @Override
    public void next() {
        System.out.println("Następny utwór");
        if (++currentSongIndex >= this.songs.length) {
            this.currentSongIndex = 0;
        }
        this.play();
    }

    @Override
    public void previous() {
        System.out.println("Poprzedni utwór");
        if (--currentSongIndex < 0) {
            this.currentSongIndex = this.songs.length - 1;
        }
        this.play();
    }

    protected Song getCurrentSong() {
        return this.songs[this.currentSongIndex];
    }
}
