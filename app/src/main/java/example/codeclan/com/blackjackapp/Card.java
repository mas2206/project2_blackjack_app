package example.codeclan.com.blackjackapp;

/**
 * Created by user on 24/04/2017.
 */

public class Card {

    private Rank rank;
    private Suit suit;

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public int getCardValue() {
        int value = rank.ordinal() + 1;
        if (value > 10) value = 10;
        return value;
    }

    public String getCardName() {
        return rank + " of " + suit;
    }

}
