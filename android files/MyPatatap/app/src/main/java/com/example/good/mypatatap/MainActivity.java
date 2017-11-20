package com.example.good.mypatatap;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {




    public void playMusic(View view){
        int id = view.getId();
        Log.i("ID","ID value is" + id);
        String nameID;

        nameID = view.getResources().getResourceEntryName(id);
        Log.i("nameId", "my NAME ID IS" + nameID);


        int myMusic = getResources().getIdentifier(nameID,"raw","com.example.good.mypatatap");
        MediaPlayer mediaPlayer = MediaPlayer.create(this , myMusic);

        mediaPlayer.start();

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
