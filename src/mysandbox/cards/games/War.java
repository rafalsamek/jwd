package mysandbox.cards.games;

import mysandbox.cards.decks.Deck;
import mysandbox.cards.decks.PlayingCard;
import mysandbox.cards.persons.Dealer;
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

    @Override
    public boolean isFinished() {
        for (Player player: this.getPlayers()) {
            if (this.playerHasNoCards(player)) {
                return true;
            }
        }

        return false;
    }

    private boolean playerHasNoCards(Player player) {
        if (player.getCards().length == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
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

        dealer.getGame().getPlayers()[1].setCards(new PlayingCard[0]);

        System.out.println("Is game finished? " + dealer.getGame().isFinished());
    }
}
