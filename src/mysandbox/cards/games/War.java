package mysandbox.cards.games;

import mysandbox.cards.decks.*;
import mysandbox.cards.persons.Dealer;
import mysandbox.cards.persons.Player;

import java.util.Arrays;

public class War implements Game {
    private Player[] players;
    private PlayingCard[] cards;
    private PlayingCard[] table = new PlayingCard[0];
    private Player trickWinner;

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
            this.getPlayers()[i % this.getPlayers().length].addCardOnThePile(card);
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

    @Override
    public Player getWinner() {
        int mostCards = 0;
        Player winner = null;
        for (Player player : this.getPlayers()) {
            if (player.getCards().length > mostCards) {
                mostCards = player.getCards().length;
                winner = player;
            }
        }
        winner.setIsWinner(true);

        return winner;
    }

    @Override
    public void playTrick() {
        PlayingCard mostSeniorCard = null;
        this.trickWinner = null;

        int i = this.table.length;

        PlayingCard[] table = new PlayingCard[this.table.length + this.getPlayers().length];
        System.arraycopy(this.table, 0, table, 0, this.table.length);
        this.table = table;

        for (Player player : this.getPlayers()) {
            this.table[i] = player.throwLastCard();
            PlayingCard newMostSeniorCard = this.findMostSeniorCard(this.table[i], mostSeniorCard);

            if (newMostSeniorCard != null && newMostSeniorCard != mostSeniorCard) {
                this.trickWinner = player;
                mostSeniorCard = newMostSeniorCard;
            }

            if (newMostSeniorCard == null) {
                this.trickWinner = null;
            }

            i++;
        }

        if (this.trickWinner == null) {
            PlayingCard[] war = new PlayingCard[this.table.length + this.getPlayers().length];
            System.arraycopy(this.table, 0, war, 0, this.table.length);
            this.table = war;

            for (Player player : this.getPlayers()) {
                this.table[i] = player.throwLastCard();
                i++;
            }
            this.playTrick();
            return;
        }

        PlayingCard[] shuffledTable = this.table.clone();
        Dealer.shuffleCards(shuffledTable);

        for (PlayingCard card : shuffledTable) {
            this.trickWinner.addCardUnderThePile(card);
        }

        this.showTrick();

        this.table = new PlayingCard[0];
    }

    @Override
    public int getCardSeniority(PlayingCard card) {
        return switch(card.getFigure()) {
            case "2" -> 2;
            case "3" -> 3;
            case "4" -> 4;
            case "5" -> 5;
            case "6" -> 6;
            case "7" -> 7;
            case "8" -> 8;
            case "9" -> 9;
            case "10" -> 10;
            case "Jack" -> 11;
            case "Queen" -> 12;
            case "King" -> 13;
            case "Ace" -> 14;
            case "Joker" -> 15;
            default -> throw new IllegalStateException("Unexpected value: " + card.getFigure());
        };
    }

    public void showTable() {
        System.out.println(Arrays.toString(this.table));
    }

    public void showTrick() {
        System.out.println();
        System.out.println("Trick:");
        this.showTable();
        System.out.println("Trick winner: " + this.trickWinner.getName());
    }

    public static void main(String[] args) {
        Player player1 = new Player("Rafał");
        Player player2 = new Player("Ewa");

        Dealer dealer = new Dealer();

        Game game = new War(
            new Deck[] {
//                new DeckOf55Cards(),
//                new DeckOf55Cards(),
//                new DeckOf24Cards(),
                new DeckOf4Cards(),
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

        System.out.println("Is game finished? " + dealer.getGame().isFinished());
    }

    private boolean playerHasNoCards(Player player) {
        if (player.getCards().length == 0) {
            return true;
        }
        return false;
    }

    private PlayingCard findMostSeniorCard(PlayingCard card, PlayingCard mostSeniorCard) {
        if (mostSeniorCard == null) {
            return card;
        }

        if (this.getCardSeniority(card) > this.getCardSeniority(mostSeniorCard)) {
            return card;
        }

        if (this.getCardSeniority(card) == this.getCardSeniority(mostSeniorCard)) {
            return null;
        }

        return mostSeniorCard;
    }
}
