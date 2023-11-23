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
}
