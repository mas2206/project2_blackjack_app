package example.codeclan.com.blackjackapp;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by user on 24/04/2017.
 */

public class Deck {

    private ArrayList<Card> cards;

    public Deck(ArrayList<Card> cards) {
        this.cards = cards;
        addCardsToDeck();
    }

    private void addCardsToDeck() {
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                cards.add(new Card(rank, suit));
            }
        }
    }

    public void shuffleDeck() {
        Collections.shuffle(cards);
    }

    public Card dealCard(Player player) {
        Card card = cards.get(0);
        player.addCardToHand(card);
        cards.remove(0);
        return card;
    }

}
