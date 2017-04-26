package example.codeclan.com.blackjackapp;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 24/04/2017.
 */

public class DeckTest {

    Deck deck;
    Player player;

    @Before
    public void before() {
        deck = new Deck(new ArrayList<Card>());
        player = new Player("Michael", new Hand());
    }

    @Test
    public void canDealCards() {
        deck.dealCard(player);
        deck.dealCard(player);
        assertEquals(5, player.getHandValue());
    }

}
