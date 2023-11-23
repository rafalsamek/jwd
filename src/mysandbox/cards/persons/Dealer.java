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

    public void shuffleCards() {
        Random rand = new Random();
        for (int i = 0; i < this.game.getCards().length; i++) {
            int randomIndexToSwap = rand.nextInt(this.game.getCards().length);
            PlayingCard temp = this.game.getCards()[randomIndexToSwap];
            this.game.getCards()[randomIndexToSwap] = this.game.getCards()[i];
            this.game.getCards()[i] = temp;
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
}
