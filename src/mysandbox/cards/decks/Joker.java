package mysandbox.cards.decks;

public class Joker implements PlayingCard {
    private final String JUNCTION = " ";
    enum Color {
        RED("Red"),
        BLACK("Black"),
        WHITE("White");

        public final String label;

        Color(String label) {
            this.label = label;
        }

        @Override
        public String toString() {
            return this.label;
        }
    }
    Joker.Color color;
    final String figure = "Joker";

    public Joker(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return this.color + this.JUNCTION + this.figure;
    }

    @Override
    public int getSeniority() {
        return 15;
    }
}
