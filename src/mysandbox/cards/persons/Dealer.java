package mysandbox.cards.persons;

import mysandbox.cards.decks.PlayingCard;
import mysandbox.cards.games.Game;

import java.util.Random;

public class Dealer {
    private Game game;

    public Game getGame() {
        return this.game;
    }

    public void startGame(Game game) {
        this.game = game;
    }

    public static void shuffleCards(PlayingCard[] cards) {
        Random rand = new Random();
        for (int i = 0; i < cards.length; i++) {
            int randomIndexToSwap = rand.nextInt(cards.length);
            PlayingCard temp = cards[randomIndexToSwap];
            cards[randomIndexToSwap] = cards[i];
            cards[i] = temp;
        }
    }

    public void dealCards() {
        this.game.dealCards();
    }

    public void showAllCards() {
        for (PlayingCard card : this.game.getCards()) {
            System.out.println(card);
        }
    }

    public void showPlayersInfo() {
        for (Player player : this.game.getPlayers()) {
            System.out.println(player);
        }
    }

    public void showWinner() {
        System.out.println();
        System.out.println(this.game.getWinner().getName() + " wins!");
    }
}
