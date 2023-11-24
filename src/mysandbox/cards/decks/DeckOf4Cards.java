package mysandbox.cards.decks;

public class DeckOf4Cards implements Deck{
    private PlayingCard[] cards = {
            new Card(Card.Figure.JACK, Card.Suit.HEARTS),
            new Card(Card.Figure.QUEEN, Card.Suit.HEARTS),
            new Card(Card.Figure.KING, Card.Suit.HEARTS),
            new Card(Card.Figure.ACE, Card.Suit.HEARTS),
    };

    public PlayingCard[] getCards() {
        return this.cards;
    }
}
