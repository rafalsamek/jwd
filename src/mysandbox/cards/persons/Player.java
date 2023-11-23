package mysandbox.cards.persons;

import mysandbox.cards.decks.PlayingCard;

public class Player {
    private final String name;
    private PlayingCard[] cards = new PlayingCard[0];

    public Player(String name) {
        this.name = name;
    }

    public PlayingCard[] getCards() {
        return this.cards;
    }

    public PlayingCard[] addCard(PlayingCard card) {
        int lastIndex = this.cards.length;
        PlayingCard[] cards = new PlayingCard[lastIndex + 1];
        System.arraycopy(this.cards, 0, cards, 0, lastIndex);
        cards[lastIndex] = card;
        this.cards = cards;

        return this.cards;
    }

    public String toString() {
        return this.name + " has " + this.getCards().length + " cards.";
    }
}
