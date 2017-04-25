package example.codeclan.com.blackjackapp;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 24/04/2017.
 */

public class PlayerTest {

    Player player;
    Card card1;
    Card card2;

    @Before
    public void before() {
        player = new Player("Michael", new Hand());
        card1 = new Card(Rank.Eight, Suit.Hearts);
        card2 = new Card(Rank.Three, Suit.Clubs);
    }

    @Test
    public void canGetPlayerName() {
        assertEquals("Michael", player.getPlayerName());
    }

    @Test
    public void canAddCardsToPlayersHandAndGetValueOfHand() {
        player.addCardToHand(card1);
        player.addCardToHand(card2);
        assertEquals(11, player.getHandValue());
    }

    @Test
    public void canReturnPlayersHandAsAString() {
        player.addCardToHand(card1);
        player.addCardToHand(card2);
        assertEquals("Eight of Hearts, Three of Clubs, ", player.getStartingCardsName());
    }

}
