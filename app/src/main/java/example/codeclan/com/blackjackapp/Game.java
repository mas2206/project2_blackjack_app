package example.codeclan.com.blackjackapp;

/**
 * Created by user on 24/04/2017.
 */

public class Game {

    private Player[] players;
    private Deck deck;

    public Game(Player[] players, Deck deck) {
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
        return players[0].getStartingCardsName();
    }

    public String playerTwoHand() {
        return players[1].getStartingCardsName();
    }

    public Player calculateWinner() {
        int indexOfWinner = players[0].getHandValue() > players[1].getHandValue() ? 0 : 1;
        return players[indexOfWinner];
    }

    public String displayWinner(Player player) {
        return player.getPlayerName() + " wins!";
    }

}
