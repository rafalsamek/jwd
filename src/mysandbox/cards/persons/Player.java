package mysandbox.cards.persons;

import mysandbox.cards.decks.Card;
import mysandbox.cards.decks.PlayingCard;

import java.util.Arrays;

public class Player {
    private String name;
    private PlayingCard[] cards = new PlayingCard[0];

    private boolean isWinner = false;

    public Player(String name) {
        this.setName(name);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PlayingCard[] getCards() {
        return this.cards;
    }

    public void setCards(PlayingCard[] cards) {
        this.cards = cards;
    }

    public void addCardOnThePile(PlayingCard card) {
        int newIndex = this.cards.length;
        PlayingCard[] cards = new PlayingCard[newIndex + 1];
        System.arraycopy(this.cards, 0, cards, 0, newIndex);
        cards[newIndex] = card;
        this.cards = cards;
    }

    public void addCardUnderThePile(PlayingCard card) {
        int newIndex = this.cards.length;
        PlayingCard[] cards = new PlayingCard[newIndex + 1];
        System.arraycopy(this.cards, 0, cards, 1, newIndex);
        cards[0] = card;
        this.cards = cards;
    }

    public PlayingCard getLastCard() {
        int lastIndex = this.cards.length - 1;
        return this.cards[lastIndex];
    }

    public PlayingCard throwLastCard() {
        PlayingCard lastCard = this.getLastCard();
        PlayingCard[] cards = new PlayingCard[this.cards.length - 1];
        System.arraycopy(this.cards, 0, cards, 0, cards.length);
        this.cards = cards;

        return lastCard;
    }

    public boolean getIsWinner() {
        return this.isWinner;
    }

    public void setIsWinner(boolean isWinner) {
        this.isWinner = isWinner;
    }

    public String toString() {
        return this.name + " has " + this.getCards().length + " cards.";
    }

    public void showCards() {
        System.out.println(this.getName() + "'s cards:");
        for (PlayingCard card : this.getCards()) {
            System.out.println(card);
        }
    }

    public static void main(String[] args) {
        Player player = new Player("Rafal");
        player.addCardOnThePile(new Card(Card.Figure.JACK, Card.Suit.DIAMONDS));
        player.addCardOnThePile(new Card(Card.Figure.QUEEN, Card.Suit.DIAMONDS));
        player.addCardOnThePile(new Card(Card.Figure.KING, Card.Suit.DIAMONDS));
        player.addCardUnderThePile(new Card(Card.Figure.TEN, Card.Suit.DIAMONDS));
        player.showCards();
        System.out.println();
        System.out.println(player.getName() + " throws card:");
        System.out.println(player.throwLastCard());
        System.out.println();
        player.showCards();
    }
}
