package com.example.good.mytimer;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView nnumber = (TextView) findViewById(R.id.nnumber);
        final TextView done = (TextView) findViewById(R.id.done);

        new CountDownTimer(10000, 1000){

            public void onTick(long millisecondUntilDone) {
                nnumber.setText("Time:" + String.valueOf(millisecondUntilDone / 1000));
            }

            public void onFinish() {
               done.setText("Done!!!!!");
            }
        }.start();

    }

}