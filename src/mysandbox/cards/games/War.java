package mysandbox.cards.games;

import mysandbox.cards.decks.Deck;
import mysandbox.cards.decks.PlayingCard;
import mysandbox.cards.persons.Player;

public class War implements Game {
    private Player[] players;
    private PlayingCard[] cards;

    public War(Deck[] decks, Player[] players) {
        this.setCards(decks);
        this.players = players;
    }

    @Override
    public PlayingCard[] getCards() {
        return this.cards;
    }

    @Override
    public void setCards(Deck[] decks) {
        int numberOfCards = 0;
        for (Deck deck : decks) {
            numberOfCards += deck.getCards().length;
        }
        this.cards = new PlayingCard[numberOfCards];

        int destPos = 0;
        for (Deck deck : decks) {
            System.arraycopy(deck.getCards(), 0, this.cards, destPos, deck.getCards().length);
            destPos = deck.getCards().length;
        }
    }

    @Override
    public Player[] getPlayers() {
        return this.players;
    }

    @Override
    public void dealCards() {
        int i = 0;
        for (PlayingCard card : this.getCards()) {
            this.getPlayers()[i % this.getPlayers().length].addCard(card);
            i++;
        }
    }
}
