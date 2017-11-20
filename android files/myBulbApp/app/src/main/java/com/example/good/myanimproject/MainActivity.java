package com.example.good.myanimproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {



    public void blueBulb (View view){
        ImageView blue =  (ImageView) findViewById(R.id.blueBulb);
        ImageView green =  (ImageView) findViewById(R.id.greenBulb);

        blue.animate().alpha(1).setDuration(1000);
        green.animate().alpha(0).setDuration(1000);

    }
    public void greenBulb (View view){
        ImageView blue = (ImageView) findViewById(R.id.blueBulb);
        ImageView green = (ImageView) findViewById(R.id.greenBulb);
        blue.animate().alpha(0).setDuration(1000);
        green.animate().alpha(1).setDuration(1000);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
