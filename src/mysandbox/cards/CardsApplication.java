package mysandbox.cards;

import mysandbox.cards.decks.Deck;
import mysandbox.cards.games.Game;
import mysandbox.cards.games.War;
import mysandbox.cards.persons.Dealer;
import mysandbox.cards.persons.Player;
import mysandbox.cards.tools.KeyInput;

public class CardsApplication {
    public static void main(String[] args) throws InterruptedException {
        KeyInput keyInput = new KeyInput();

        Player player1 = new Player("Rafał");
        Player player2 = new Player("Ewa");

        Dealer dealer = new Dealer();

        Deck deck1 = new Deck();
        Deck deck2 = new Deck();

        Game game = new War(
            new Deck[] {
                deck1,
                deck2
            },
            new Player[] {
                player1,
                player2
            }
        );

        dealer.startGame(game);
        dealer.shuffleCards();
        dealer.dealCards();
        dealer.showPlayersInfo();

//        while (!dealer.getGame().isFinished()) {
//            dealer.getGame().playTrick();
//            dealer.getGame().showTrick();
//            keyInput.waitUntilKeyPressed(KeyEvent.VK_SPACE);
//        }
//        dealer.showWinner();
        keyInput.getFrame().dispose();
    }
}
