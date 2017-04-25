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

    public boolean checkForBlackjack() {
        for (Player player : players) {
            if (player.getCardOneValue() == 1 && player.getCardTwoValue() == 10 ) {
                return true;
            }
            else if (player.getCardOneValue() == 10 && player.getCardTwoValue() == 1) {
                return true;
            }
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
        else if (checkForBlackjack() == true) {
            return player.getPlayerName() + " got Blackjack!";
        }
        return player.getPlayerName() + " won!";
    }

}
