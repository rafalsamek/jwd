package mysandbox.chatgpt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


class Card {
    private final String suit;
    private final String rank;

    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public String getSuit() {
        return suit;
    }

    public String getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}

class Deck {
    private final List<Card> cards;

    public Deck() {
        cards = new ArrayList<>();
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        for (String suit : suits) {
            for (String rank : ranks) {
                cards.add(new Card(suit, rank));
            }
        }

        Collections.shuffle(cards);
    }

    public Card drawCard() {
        if (!cards.isEmpty()) {
            return cards.remove(cards.size() - 1);
        }
        return null;
    }
}

public class WarGame {
    public static void main(String[] args) {
        Deck deck = new Deck();

        List<Card> player1Cards = new ArrayList<>();
        List<Card> player2Cards = new ArrayList<>();

        for (int i = 0; i < 26; i++) {
            player1Cards.add(deck.drawCard());
            player2Cards.add(deck.drawCard());
        }

        Scanner scanner = new Scanner(System.in);
        int roundNumber = 1;

        while (!player1Cards.isEmpty() && !player2Cards.isEmpty()) {
            System.out.println("\nRound " + roundNumber);
            roundNumber++;

            Card card1 = player1Cards.remove(player1Cards.size() - 1);
            Card card2 = player2Cards.remove(player2Cards.size() - 1);

            System.out.println("Player 1 plays: " + card1);
            System.out.println("Player 2 plays: " + card2);

            int result = compareCards(card1, card2);

            if (result == 1) {
                player1Cards.add(0, card1);
                player1Cards.add(0, card2);
                System.out.println("Player 1 wins the round!");
            } else if (result == 2) {
                player2Cards.add(0, card2);
                player2Cards.add(0, card1);
                System.out.println("Player 2 wins the round!");
            } else {
                System.out.println("It's a tie! War!");
            }

            System.out.println("Press Enter to continue...");
            scanner.nextLine();
        }

        if (player1Cards.isEmpty()) {
            System.out.println("\nPlayer 2 wins the game!");
        } else {
            System.out.println("\nPlayer 1 wins the game!");
        }
    }

    private static int compareCards(Card card1, Card card2) {
        String[] ranksOrder = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        int rank1Index = java.util.Arrays.asList(ranksOrder).indexOf(card1.getRank());
        int rank2Index = java.util.Arrays.asList(ranksOrder).indexOf(card2.getRank());

        if (rank1Index > rank2Index) {
            return 1;
        } else if (rank1Index < rank2Index) {
            return 2;
        } else {
            return 0;
        }
    }
}

