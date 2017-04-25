package example.codeclan.com.blackjackapp;

import java.util.ArrayList;

/**
 * Created by user on 24/04/2017.
 */

public class Game {

    private ArrayList<Player> players;
    private Deck deck;

    public Game(ArrayList<Player> players, Deck deck) {
        this.players = players;
        this.deck = deck;
    }

    private void dealCards() {
        for (Player player : players) {
            deck.dealCard(player);
            deck.dealCard(player);
        }
    }

    public void setupGame() {
        deck.shuffleDeck();
        dealCards();
    }

    public String playerOneHand() {
        return players.get(0).getStartingCardsName();
    }

    public String playerTwoHand() {
        return players.get(1).getStartingCardsName();
    }

    public boolean checkDraw() {
        if (players.get(0).getHandValue() == players.get(1).getHandValue()) {
            return true;
        }
        return false;
    }

    public Player calculateWinner() {
        if (players.get(0).getHandValue() == players.get(1).getHandValue()) {
            return null;
        }
        int indexOfWinner = players.get(0).getHandValue() > players.get(1).getHandValue() ? 0 : 1;
        return players.get(indexOfWinner);
    }

    public String displayWinner(Player player) {
        if (checkDraw() == true) {
            return "It's a draw!";
        }
        return player.getPlayerName() + " wins!";
    }

}
