package example.codeclan.com.blackjackapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Game game;
    TextView playerOneHandText;
    TextView playerTwoHandText;
    TextView resultText;
    Button buttonPlayGame;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playerOneHandText = (TextView) findViewById(R.id.player1_hand_text);
        playerTwoHandText = (TextView) findViewById(R.id.player2_hand_text);
        resultText = (TextView) findViewById(R.id.result_text);
        buttonPlayGame = (Button) findViewById(R.id.play_game_button);
    }

    public void onPlayGameButtonClick(View view) {
        game.setupGame();
        String playerOneHand = game.playerOneHand();
        String playerTwoHand = game.playerTwoHand();
        Player winner = game.calculateWinner();
        String winnerMessage = game.displayWinner(winner);

        playerOneHandText.setText(playerOneHand);
        playerTwoHandText.setText(playerTwoHand);
        resultText.setText(winnerMessage);
    }

}
