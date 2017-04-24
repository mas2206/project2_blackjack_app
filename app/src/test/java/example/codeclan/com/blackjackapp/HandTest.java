package example.codeclan.com.blackjackapp;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 24/04/2017.
 */

public class HandTest {

    Hand hand;
    Card card1;
    Card card2;

    @Before
    public void before() {
        hand = new Hand();
        card1 = new Card(Rank.Five, Suit.Clubs);
        card2 = new Card(Rank.King, Suit.Hearts);
    }

    @Test
    public void canAddCardsToHandAndGetValueOfHand() {
        hand.addCardToHand(card1);
        hand.addCardToHand(card2);
        assertEquals(15, hand.getHandValue());
    }

}
