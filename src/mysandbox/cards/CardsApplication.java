package mysandbox.cards;

import mysandbox.cards.decks.Deck;
import mysandbox.cards.decks.DeckOf24Cards;
import mysandbox.cards.decks.DeckOf4Cards;
import mysandbox.cards.decks.DeckOf55Cards;
import mysandbox.cards.games.Game;
import mysandbox.cards.games.War;
import mysandbox.cards.persons.Dealer;
import mysandbox.cards.persons.Player;
import mysandbox.cards.tools.KeyInput;

import java.awt.event.KeyEvent;

public class CardsApplication {
    public static void main(String[] args) throws InterruptedException {
        KeyInput keyInput = new KeyInput();

        Player player1 = new Player("Rafał");
        Player player2 = new Player("Ewa");

        Dealer dealer = new Dealer();

        Game game = new War(
            new Deck[] {
//                new DeckOf55Cards(),
//                new DeckOf55Cards(),
                new DeckOf24Cards(),
//                new DeckOf4Cards(),
            },
            new Player[] {
                player1,
                player2
            }
        );

        dealer.startGame(game);
        Dealer.shuffleCards(dealer.getGame().getCards());
        dealer.dealCards();
        dealer.showPlayersInfo();

        System.out.println("Press space bar to continue...");
        keyInput.waitUntilKeyPressed(KeyEvent.VK_SPACE);

        while (!dealer.getGame().isFinished()) {
            dealer.getGame().playTrick();
            dealer.showPlayersInfo();

            System.out.println("Press space bar to continue...");
            keyInput.waitUntilKeyPressed(KeyEvent.VK_SPACE);
        }

        dealer.showWinner();

        keyInput.getFrame().dispose();
    }
}
