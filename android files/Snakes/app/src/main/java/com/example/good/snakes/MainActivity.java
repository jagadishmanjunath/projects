package com.example.good.snakes;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    int [] myDice = {
            R.drawable.one,
            R.drawable.two,
            R.drawable.three,
            R.drawable.four,
            R.drawable.five,
            R.drawable.six

    };

    public void rollTapped(View view){
        Log.i("Button","ButtonTapped");

        Random ran = new Random();
        int randomNumber = ran.nextInt(6);
         Log.i ( "Button","ButtonTapped");

        Log.i ("Random", "Random Number Is:"+ randomNumber);

        ImageView dice =  findViewById(R.id.all);
        dice.setImageResource(myDice[randomNumber]);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
