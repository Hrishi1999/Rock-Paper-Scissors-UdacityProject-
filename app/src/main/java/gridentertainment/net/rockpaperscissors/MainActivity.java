package gridentertainment.net.rockpaperscissors;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView mImageView1;
    private ImageView mImageView2;
    private Button mButton;

    private String player1 = "";
    private String player2 = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        referenceItems();

        mButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Random rn = new Random();
                int minimum = 1;
                int maximum = 3;
                int range = maximum - minimum + 1;
                int randomNum =  rn.nextInt(range) + minimum;
                int randomNum2 =  rn.nextInt(range) + minimum;

                playGame(randomNum,randomNum2);
                decidePlayer();
            }
        });
    }

    void referenceItems()
    {
        mImageView1 = findViewById(R.id.imageView);
        mImageView2 = findViewById(R.id.imageView4);
        mButton = findViewById(R.id.button);
    }

    void playGame(int ran, int ran2)
    {

        //for player 1
        switch (ran)
        {
            case 1:
                mImageView1.setImageResource(R.drawable.rock);
                player1 = "R";
                break;
            case 2:
                mImageView1.setImageResource(R.drawable.paper);
                player1 = "P";
                break;
            case 3:
                mImageView1.setImageResource(R.drawable.scissors);
                player1 = "S";
                break;
        }

        switch (ran2)
        {
            case 1:
                mImageView2.setImageResource(R.drawable.rock);
                player2 = "R";
                break;
            case 2:
                mImageView2.setImageResource(R.drawable.paper);
                player2 = "P";
                break;
            case 3:
                mImageView2.setImageResource(R.drawable.scissors);
                player2 = "S";
                break;
        }

    }

    void decidePlayer()
    {
        if (player1.equals(player2))
        {
            Toast.makeText(this, "DRAW!", Toast.LENGTH_SHORT).show();
        }
        if (player1.equals("R") && player2.equals("S"))
        {
            Toast.makeText(this, "Player 1 wins!", Toast.LENGTH_SHORT).show();
        }
        if (player1.equals("P") && player2.equals("R"))
        {
            Toast.makeText(this, "Player 1 wins!", Toast.LENGTH_SHORT).show();

        }
        if (player1.equals("S") && player2.equals("P"))
        {
            Toast.makeText(this, "Player 1 wins!", Toast.LENGTH_SHORT).show();

        }
        if (player1.equals("R") && player2.equals("P"))
        {
            Toast.makeText(this, "Player 2 wins!", Toast.LENGTH_SHORT).show();

        }

        if (player1.equals("P") && player2.equals("S"))
        {
            Toast.makeText(this, "Player 2 wins!", Toast.LENGTH_SHORT).show();

        }
        if (player1.equals("S") && player2.equals("R"))
        {
            Toast.makeText(this, "Player 2 wins!", Toast.LENGTH_SHORT).show();

        }
    }
}
