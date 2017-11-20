package com.example.good.volleytwo;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageRequest;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String myURl = "https://upload.wikimedia.org/wikipedia/commons/e/ee/Android_green_figure%2C_next_to_its_original_packaging.jpg";
        final ImageView imageView = (ImageView) findViewById(R.id.imageView);
        Button myButton = (Button) findViewById(R.id.button);


        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageRequest imageRequest = new ImageRequest(myURl,
                        new Response.Listener<Bitmap>() {
                            @Override
                            public void onResponse(Bitmap response) {
                                imageView.setImageBitmap(response);
                            }
                        }, 0, 0, null,

                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                Log.i("Error","Error");
                            }
                        }
                );
                Mysingleton.getInstance(MainActivity.this).addToRequestQueue(imageRequest);


            }
        });
    }
}
