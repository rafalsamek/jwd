package mysandbox.cards.decks;

public class DeckOf24Cards implements Deck{
    private PlayingCard[] cards = {
            new Card(Card.Figure.NINE, Card.Suit.HEARTS),
            new Card(Card.Figure.TEN, Card.Suit.HEARTS),
            new Card(Card.Figure.JACK, Card.Suit.HEARTS),
            new Card(Card.Figure.QUEEN, Card.Suit.HEARTS),
            new Card(Card.Figure.KING, Card.Suit.HEARTS),
            new Card(Card.Figure.ACE, Card.Suit.HEARTS),

            new Card(Card.Figure.NINE, Card.Suit.DIAMONDS),
            new Card(Card.Figure.TEN, Card.Suit.DIAMONDS),
            new Card(Card.Figure.JACK, Card.Suit.DIAMONDS),
            new Card(Card.Figure.QUEEN, Card.Suit.DIAMONDS),
            new Card(Card.Figure.KING, Card.Suit.DIAMONDS),
            new Card(Card.Figure.ACE, Card.Suit.DIAMONDS),

            new Card(Card.Figure.NINE, Card.Suit.CLUBS),
            new Card(Card.Figure.TEN, Card.Suit.CLUBS),
            new Card(Card.Figure.JACK, Card.Suit.CLUBS),
            new Card(Card.Figure.QUEEN, Card.Suit.CLUBS),
            new Card(Card.Figure.KING, Card.Suit.CLUBS),
            new Card(Card.Figure.ACE, Card.Suit.CLUBS),

            new Card(Card.Figure.NINE, Card.Suit.SPADES),
            new Card(Card.Figure.TEN, Card.Suit.SPADES),
            new Card(Card.Figure.JACK, Card.Suit.SPADES),
            new Card(Card.Figure.QUEEN, Card.Suit.SPADES),
            new Card(Card.Figure.KING, Card.Suit.SPADES),
            new Card(Card.Figure.ACE, Card.Suit.SPADES),
    };

    public PlayingCard[] getCards() {
        return this.cards;
    }
}
