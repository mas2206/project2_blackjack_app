package example.codeclan.com.blackjackapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Game game;
    TextView dealersHandText;
    TextView playersHandText;
    TextView resultText;
    Button buttonDealCards;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onDealCardsButtonClick(View view) {
        //set up game - game.setUpGame();
        //display text on the screen with hand values for both players - game.playerOne/TwoHand();
        //calculate winner - game.calculateWinner();
        //display winner
    }

}
