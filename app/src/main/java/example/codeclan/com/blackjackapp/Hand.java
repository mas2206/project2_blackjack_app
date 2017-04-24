package example.codeclan.com.blackjackapp;

import java.util.ArrayList;

/**
 * Created by user on 24/04/2017.
 */

public class Hand {

    private ArrayList<Card> cards;

    public Hand() {
        this.cards = new ArrayList<Card>();
    }

    public void addCardToHand(Card card) {
        cards.add(card);
    }

    public int getHandValue() {
        int totalValue = 0;
        for (Card card : cards) {
            totalValue += card.getCardValue();
        }
        return totalValue;
    }

}
