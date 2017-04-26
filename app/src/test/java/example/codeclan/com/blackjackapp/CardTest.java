package example.codeclan.com.blackjackapp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 24/04/2017.
 */

public class CardTest {

    Card card;

    @Test
    public void aceValueIsEleven() {
        card = new Card(Rank.Ace, Suit.Spades);
        assertEquals(11, card.getCardValue());
    }

    @Test
    public void fiveValueIsFive() {
        card = new Card(Rank.Five, Suit.Spades);
        assertEquals(5, card.getCardValue());
    }

    @Test
    public void jackValueIsTen() {
        card = new Card(Rank.Jack, Suit.Spades);
        assertEquals(10, card.getCardValue());
    }

    @Test
    public void queenValueIsTen() {
        card = new Card(Rank.Queen, Suit.Spades);
        assertEquals(10, card.getCardValue());
    }

    @Test
    public void kingValueIsTen() {
        card = new Card(Rank.King, Suit.Spades);
        assertEquals(10, card.getCardValue());
    }

    @Test
    public void cardNameWorks() {
        card = new Card(Rank.Four, Suit.Hearts);
        assertEquals("Four of Hearts", card.getCardName());
    }

}
