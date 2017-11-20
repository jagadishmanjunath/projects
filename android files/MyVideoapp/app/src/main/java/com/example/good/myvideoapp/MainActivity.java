package com.example.good.myvideoapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//          Basics of video
        // 1. get video view
        VideoView videoView = findViewById(R.id.videoView2);
        // 2. point to video resourse
        videoView.setVideoPath("android.resource://"+ getPackageName()+"/" +R.raw.intro);
        // add media Controller

        MediaController mediaController = new MediaController(this );

        mediaController.setAnchorView(videoView);

        videoView.setMediaController(mediaController);
        //run it

        videoView.start();

    }
}
