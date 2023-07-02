package com.bridgelabz.oops_programs;

import java.util.Random;

public class DeckOfCards {
    String[] deck = new String[52];
    String[] suit = {"Clubs", "Diamonds", "Hearts", "Spades"};
    String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

    String[][] playCards = new String[4][9];
    static Random random = new Random();

    public void alignCards() {

        int deckIndex = 0;
        for (int i = 0; i < suit.length; i++) {
            for (int j = 0; j < rank.length; j++) {

                deck[deckIndex] = rank[j] + " of " + suit[i];
                deckIndex++;
            }
        }
    }

    public String[] shuffleCards() {

        int j = 0;
        String temp;
        for (int i = 0; i < deck.length; i++) {
            j = random.nextInt(52);

            temp = deck[i];
            deck[i] = deck[j];
            deck[j] = temp;
        }
        return deck;
    }

    public void displayCards(String[] deck) {
        int deckindex = 0;

        for (int i = 0; i < playCards.length; i++) {
            System.out.println("player is " + (i + 1));
            for (int j = 0; j < playCards[i].length; j++) {
                playCards[i][j] = deck[deckindex];
                System.out.println(playCards[i][j]);
                deckindex++;
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        DeckOfCards player = new DeckOfCards();
        player.alignCards();
        String[] deck = player.shuffleCards();
        player.displayCards(deck);

    }
}
