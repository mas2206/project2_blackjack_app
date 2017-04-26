package example.codeclan.com.blackjackapp;

import java.util.ArrayList;

/**
 * Created by user on 24/04/2017.
 */

public class Player {

    private String name;
    private Hand hand;

    public Player(String name, Hand hand) {
        this.name = name;
        this.hand = hand;
    }

    public String getPlayerName() {
        return name;
    }

    public void addCardToHand(Card card) {
        hand.addCardToHand(card);
    }

    public int getHandValue() {
        return hand.getHandValue();
    }

    public int getCardOneValue() {
        return hand.getCards().get(0).getCardValue();
    }

    public int getCardTwoValue() {
        return hand.getCards().get(1).getCardValue();
    }

    public String getStartingCardsName() {
        String cards = "";
        for (Card card : hand.getCards()) {
            cards += card.getCardName() + ", ";
        }
        return cards.substring(0, cards.length() - 2);
    }

}
