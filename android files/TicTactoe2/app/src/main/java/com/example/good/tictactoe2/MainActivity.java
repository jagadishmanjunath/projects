package com.example.good.tictactoe2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    int myActivePlayer = 0;
    // 0 for cross and 1 for circle

    public void imageTapped( View view) {
        ImageView myTapped = (ImageView) view ;
        // my game State
        int [] myGameState = {2,2,2,2,2,2,2,2,2};

      // Log.i("tagis","image number is" + myTapped.getTag().toString());
       int tappedimageTag = Integer.parseInt( myTapped.getTag().toString());
        if (myGameState[tappedimageTag] == 2){

           myGameState[tappedimageTag] = myActivePlayer;
            if (myActivePlayer == 0){
                myTapped.setImageResource(R.drawable.cross);
                myTapped.animate().rotation(360).setDuration(1000);
                myActivePlayer = 1;
            }else{
                myTapped.setImageResource(R.drawable.circle);
                myActivePlayer = 0;
            }
        }
            public void playagain(View view){

//        Log.i("msg", "play again tapped");
//        change Game state back to 2
                for ( int i =0; i < myGameState.length; i++){
                    myGameState[i] = 2;

                }

//        make Active player to 0
                myActivePlayer = 0;


//        change all images to ic_launcher
            LinearLayout linearLayout = (LinearLayout) findViewById(R.id.linearLayout);

            }
        }

    }




    public void playa
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
