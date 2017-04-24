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
        Card card;

        for (Player player : players) {
            deck.dealCard(player);
            deck.dealCard(player);
            String totalValue = "Total: " + player.getHandValue();
        }
    }

    private void calculateWinner() {
        int indexOfWinner = players[0].getHandValue() > players[1].getHandValue() ? 0 : 1;
        String result = players[indexOfWinner].getPlayerName() + " wins!";
    }

    public void play() {
        deck.shuffleDeck();
        dealCards();
        calculateWinner();
    }

}
