package example.codeclan.com.blackjackapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Game game;
    Player player1;
    Player player2;
    Hand hand1;
    Hand hand2;
    Deck deck;
    TextView playerOneHandText;
    TextView playerOneHandValue;
    TextView playerTwoHandText;
    TextView playerTwoHandValue;
    TextView resultText;
    Button buttonPlayGame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playerOneHandText = (TextView) findViewById(R.id.player1_hand_text);
        playerOneHandValue = (TextView) findViewById(R.id.player1_hand_value);
        playerTwoHandText = (TextView) findViewById(R.id.player2_hand_text);
        playerTwoHandValue = (TextView) findViewById(R.id.player2_hand_value);
        resultText = (TextView) findViewById(R.id.result_text);
        buttonPlayGame = (Button) findViewById(R.id.play_game_button);
    }

    public void onPlayGameButtonClick(View view) {
        deck = new Deck(new ArrayList<Card>());
        hand1 = new Hand();
        hand2 = new Hand();
        player1 = new Player("You", hand1);
        player2 = new Player("The dealer", hand2);
        ArrayList<Player> players = new ArrayList<Player>();
        players.add(player1);
        players.add(player2);
        game = new Game(players, deck);
        game.setupGame();
        String playerOneHand = game.playerOneHand();
        String playerTwoHand = game.playerTwoHand();
        Player winner = game.calculateWinner();
        String winnerMessage = game.displayWinner(winner);

        playerOneHandText.setText(playerOneHand);
        playerOneHandValue.setText(" " + player1.getHandValue());
        playerTwoHandText.setText(playerTwoHand);
        playerTwoHandValue.setText(" " + player2.getHandValue());
        resultText.setText(winnerMessage);
    }

}
