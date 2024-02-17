package interfaces.lab;

/**
 * Stwórz szkielet programu symulującego działanie różnych odtwarzaczy muzycznych jak Streamer, Mp3, CD itd., wg wytycznych:
 * konkretne odtwarzacze powinny rozszerzać abstrakcyjną klasę MusicPlayer,
 * abstrakcyjna klasa MusicPlayer powinna implementować interfejs Player,
 * interfejs Player powienien dostarczać takich funkcji jak odtwarzaj, pauza stop, następny utwór, poprzedni utwór,
 * przetestuj działanie odwtwarzaczy (np. przez wyświetlenie odpowiednich komunikatów ‘Gra odtwarzacz MP3’).
 *
 * Rozbuduj szkielet programu z punktu 1 o zasilenie odtwarzaczy zbiorami piosenek, w tym celu:
 * zaprojektuj hermetyczną klasę Song przechowującą takie informacje jak nazwa artysty, tytuł utworu, nazwa albumu,
 * każdy odtwarzacz powinien przechowywać swój zbiór utworów,
 * zbiory piosenek powinny być ładowane podczas tworzenia odtwarzaczy,
 * użycie akcji odwtarzaj powinno wyświetlać informację o odtwarzanym utworze,
 * akcje następny, poprzedni powinny odpowiednio zmieniać utwory.
 */
public class PlayersApp {
    public static void main(String[] args) {
        Player[] players = {
            new StreamerPlayer(
                    new Song[] {
                        new Song("Dżem", "Śmiech czy łzy", "Detox"),
                        new Song("Dżem", "Ostatnie widzenie", "Detox"),
                        new Song("Dżem", "Mamy forsę, mamy czas", "Detox"),
                    }
            ),
            new MP3Player(
                    new Song[] {
                            new Song("Dżem", "Śmiech czy łzy", "Detox"),
                            new Song("Dżem", "Ostatnie widzenie", "Detox"),
                            new Song("Dżem", "Mamy forsę, mamy czas", "Detox"),
                    }
            ),
            new CDPlayer(
                    new Song[] {
                            new Song("Dżem", "Śmiech czy łzy", "Detox"),
                            new Song("Dżem", "Ostatnie widzenie", "Detox"),
                            new Song("Dżem", "Mamy forsę, mamy czas", "Detox"),
                    }
            ),
        };
        for (Player player : players) {
            player.play();
            player.next();
            player.next();
            player.next();

            player.previous();
            player.previous();
        }
    }
}
