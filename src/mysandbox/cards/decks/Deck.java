package mysandbox.cards.decks;

public class Deck {
    private PlayingCard[] cards = {
        new Card(Card.Figure.ACE, Card.Suit.HEARTS),
        new Card(Card.Figure.TWO, Card.Suit.HEARTS),
        new Card(Card.Figure.THREE, Card.Suit.HEARTS),
        new Card(Card.Figure.FOUR, Card.Suit.HEARTS),
        new Card(Card.Figure.FIVE, Card.Suit.HEARTS),
        new Card(Card.Figure.SIX, Card.Suit.HEARTS),
        new Card(Card.Figure.SEVEN, Card.Suit.HEARTS),
        new Card(Card.Figure.EIGHT, Card.Suit.HEARTS),
        new Card(Card.Figure.NINE, Card.Suit.HEARTS),
        new Card(Card.Figure.TEN, Card.Suit.HEARTS),
        new Card(Card.Figure.JACK, Card.Suit.HEARTS),
        new Card(Card.Figure.QUEEN, Card.Suit.HEARTS),
        new Card(Card.Figure.KING, Card.Suit.HEARTS),

        new Joker(Joker.Color.RED),

        new Card(Card.Figure.ACE, Card.Suit.DIAMONDS),
        new Card(Card.Figure.TWO, Card.Suit.DIAMONDS),
        new Card(Card.Figure.THREE, Card.Suit.DIAMONDS),
        new Card(Card.Figure.FOUR, Card.Suit.DIAMONDS),
        new Card(Card.Figure.FIVE, Card.Suit.DIAMONDS),
        new Card(Card.Figure.SIX, Card.Suit.DIAMONDS),
        new Card(Card.Figure.SEVEN, Card.Suit.DIAMONDS),
        new Card(Card.Figure.EIGHT, Card.Suit.DIAMONDS),
        new Card(Card.Figure.NINE, Card.Suit.DIAMONDS),
        new Card(Card.Figure.TEN, Card.Suit.DIAMONDS),
        new Card(Card.Figure.JACK, Card.Suit.DIAMONDS),
        new Card(Card.Figure.QUEEN, Card.Suit.DIAMONDS),
        new Card(Card.Figure.KING, Card.Suit.DIAMONDS),

        new Joker(Joker.Color.BLACK),

        new Card(Card.Figure.ACE, Card.Suit.CLUBS),
        new Card(Card.Figure.TWO, Card.Suit.CLUBS),
        new Card(Card.Figure.THREE, Card.Suit.CLUBS),
        new Card(Card.Figure.FOUR, Card.Suit.CLUBS),
        new Card(Card.Figure.FIVE, Card.Suit.CLUBS),
        new Card(Card.Figure.SIX, Card.Suit.CLUBS),
        new Card(Card.Figure.SEVEN, Card.Suit.CLUBS),
        new Card(Card.Figure.EIGHT, Card.Suit.CLUBS),
        new Card(Card.Figure.NINE, Card.Suit.CLUBS),
        new Card(Card.Figure.TEN, Card.Suit.CLUBS),
        new Card(Card.Figure.JACK, Card.Suit.CLUBS),
        new Card(Card.Figure.QUEEN, Card.Suit.CLUBS),
        new Card(Card.Figure.KING, Card.Suit.CLUBS),

        new Joker(Joker.Color.WHITE),

        new Card(Card.Figure.ACE, Card.Suit.SPADES),
        new Card(Card.Figure.TWO, Card.Suit.SPADES),
        new Card(Card.Figure.THREE, Card.Suit.SPADES),
        new Card(Card.Figure.FOUR, Card.Suit.SPADES),
        new Card(Card.Figure.FIVE, Card.Suit.SPADES),
        new Card(Card.Figure.SIX, Card.Suit.SPADES),
        new Card(Card.Figure.SEVEN, Card.Suit.SPADES),
        new Card(Card.Figure.EIGHT, Card.Suit.SPADES),
        new Card(Card.Figure.NINE, Card.Suit.SPADES),
        new Card(Card.Figure.TEN, Card.Suit.SPADES),
        new Card(Card.Figure.JACK, Card.Suit.SPADES),
        new Card(Card.Figure.QUEEN, Card.Suit.SPADES),
        new Card(Card.Figure.KING, Card.Suit.SPADES),
    };

    public PlayingCard[] getCards() {
        return this.cards;
    }
}
