package mysandbox.cards.decks;

public class Card implements PlayingCard {
    private final String JUNCTION = " of ";
    public enum Suit {
        HEARTS("Hearts"),
        DIAMONDS("Diamonds"),
        CLUBS("Clubs"),
        SPADES("Spades");
        public final String label;

        Suit(String label) {
            this.label = label;
        }

        @Override
        public String toString() {
            return this.label;
        }
    }

    public enum Figure {
        ACE("Ace"),
        TWO("2"),
        THREE("3"),
        FOUR("4"),
        FIVE("5"),
        SIX("6"),
        SEVEN("7"),
        EIGHT("8"),
        NINE("9"),
        TEN("10"),
        JACK("Jack"),
        QUEEN("Queen"),
        KING("King");

        public final String label;

        Figure(String label) {
            this.label = label;
        }

        @Override
        public String toString() {
            return this.label;
        }
    }

    Figure figure;

    Suit suit;

    public Card(Figure figure, Suit suit) {
        this.figure = figure;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return this.figure + this.JUNCTION + this.suit;
    }

    @Override
    public String getFigure() {
        return this.figure.label;
    }

    @Override
    public String getSuit() {
        return this.suit.label;
    }

}
