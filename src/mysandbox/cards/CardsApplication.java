package mysandbox.cards;

import java.awt.event.KeyEvent;

public class CardsApplication {
    public static void main(String[] args) throws InterruptedException {
        KeyInput keyInput = new KeyInput();
        int i = 0;
        while (true) {
            i++;
            keyInput.waitUntilKeyPressed(KeyEvent.VK_SPACE);
            System.out.println("Wait... " + i);
        }
//        Player player1 = new Player("Rafał");
//        Player player2 = new Player("Ewa");
//
//        Dealer dealer = new Dealer();
//
//        Deck deck1 = new Deck();
//        Deck deck2 = new Deck();
//
//        Game game = new War([deck1, deck2], player1, player2);
//
//        dealer.startGame(game);
//        dealer.shuffleCards();
//        dealer.dealCards();
//
//        while (!dealer.getGame().isFinished()) {
//            dealer.getGame().playTrick();
//            dealer.getGame().showTrick();
//            waitForSpacePressed();
//        }
//        dealer.showWinner();
    }
}
