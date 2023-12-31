package mysandbox.cards.games;

import mysandbox.cards.decks.Deck;
import mysandbox.cards.decks.PlayingCard;
import mysandbox.cards.persons.Player;

public interface Game {
    PlayingCard[] getCards();

    void setCards(Deck[] decks);

    Player[] getPlayers();

    void dealCards();

    boolean isFinished();

    Player getWinner();

    void playTrick();

    int getCardSeniority(PlayingCard card);

    void showTrick();

    void showTable();
}
