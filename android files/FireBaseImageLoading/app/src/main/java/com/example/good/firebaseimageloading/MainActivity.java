package com.example.good.firebaseimageloading;

import android.os.Bundle;
import android.os.storage.StorageManager;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ImageView;

import com.google.firebase.storage.FirebaseStorage;

public class MainActivity extends AppCompatActivity {

        StorageManager mStorage;
        Button button;
        ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);



        imageView = findViewById(R.id.imageView);
        mStorage = FirebaseStorage.getInstance().getReference();
    }
}
