package example.codeclan.com.blackjackapp;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 26/04/2017.
 */

public class GameTest {

    ArrayList<Player> players;
    Player player1;
    Player player2;
    Card card1;
    Card card2;
    Card card3;
    Card card4;
    Game game;
    Deck deck;

    @Test
    public void playerWith20BeatsPlayerWith15() {
        players = new ArrayList<>();
        player1 = new Player("Player 1", new Hand());
        player2 = new Player("Player 2", new Hand());
        players.add(player1);
        players.add(player2);
        game = new Game(players, deck);
        card1 = new Card(Rank.Queen, Suit.Clubs);
        card2 = new Card(Rank.King, Suit.Hearts);
        player1.addCardToHand(card1);
        player1.addCardToHand(card2);
        card3 = new Card(Rank.Ten, Suit.Clubs);
        card4 = new Card(Rank.Five, Suit.Spades);
        player2.addCardToHand(card3);
        player2.addCardToHand(card4);
        Player player = game.calculateWinner();
        assertEquals("Player 1 won!", game.displayWinner(player));
    }

    @Test
    public void blackJackCanOccur() {
        players = new ArrayList<>();
        player1 = new Player("Player 1", new Hand());
        player2 = new Player("Player 2", new Hand());
        players.add(player1);
        players.add(player2);
        game = new Game(players, deck);
        card1 = new Card(Rank.Ace, Suit.Spades);
        card2 = new Card(Rank.Jack, Suit.Spades);
        player1.addCardToHand(card1);
        player1.addCardToHand(card2);
        card3 = new Card(Rank.Ten, Suit.Clubs);
        card4 = new Card(Rank.Five, Suit.Spades);
        player2.addCardToHand(card3);
        player2.addCardToHand(card4);
        Player player = game.calculateWinner();
        assertEquals("Player 1 got a Blackjack and won!", game.displayWinner(player));
    }

    @Test
    public void drawCanOccur() {
        players = new ArrayList<>();
        player1 = new Player("Player 1", new Hand());
        player2 = new Player("Player 2", new Hand());
        players.add(player1);
        players.add(player2);
        game = new Game(players, deck);
        card1 = new Card(Rank.Queen, Suit.Clubs);
        card2 = new Card(Rank.King, Suit.Hearts);
        player1.addCardToHand(card1);
        player1.addCardToHand(card2);
        card3 = new Card(Rank.Queen, Suit.Hearts);
        card4 = new Card(Rank.Ten, Suit.Spades);
        player2.addCardToHand(card3);
        player2.addCardToHand(card4);
        Player player = game.calculateWinner();
        assertEquals("It's a draw!", game.displayWinner(player));
    }

    @Test
    public void doubleBlackjackResultsInDraw() {
        players = new ArrayList<>();
        player1 = new Player("Player 1", new Hand());
        player2 = new Player("Player 2", new Hand());
        players.add(player1);
        players.add(player2);
        game = new Game(players, deck);
        card1 = new Card(Rank.Ace, Suit.Spades);
        card2 = new Card(Rank.Jack, Suit.Spades);
        player1.addCardToHand(card1);
        player1.addCardToHand(card2);
        card3 = new Card(Rank.Ace, Suit.Clubs);
        card4 = new Card(Rank.Jack, Suit.Clubs);
        player2.addCardToHand(card3);
        player2.addCardToHand(card4);
        Player player = game.calculateWinner();
        assertEquals("It's a draw!", game.displayWinner(player));
    }

    @Test
    public void doubleAceResultsInBlackjack() {
        players = new ArrayList<>();
        player1 = new Player("Player 1", new Hand());
        player2 = new Player("Player 2", new Hand());
        players.add(player1);
        players.add(player2);
        game = new Game(players, deck);
        card1 = new Card(Rank.Ace, Suit.Spades);
        card2 = new Card(Rank.Ace, Suit.Hearts);
        player1.addCardToHand(card1);
        player1.addCardToHand(card2);
        card3 = new Card(Rank.Two, Suit.Clubs);
        card4 = new Card(Rank.Three, Suit.Clubs);
        player2.addCardToHand(card3);
        player2.addCardToHand(card4);
        Player player = game.calculateWinner();
        assertEquals("Player 1 got a Blackjack and won!", game.displayWinner(player));
    }

}
