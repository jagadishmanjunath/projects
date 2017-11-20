package com.example.good.mystack;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class MainActivity extends AppCompatActivity {



    public  class SetUpFetch extends AsyncTask<String,Void,String>{

        @Override
        protected String doInBackground(String... strings) {
            URL url;
            String page = "";
            HttpURLConnection urlConnection = null;


            try{
                url = new URL(strings[0]);

                urlConnection = (HttpURLConnection) url.openConnection();
                InputStream inputStream = urlConnection.getInputStream();

                InputStreamReader read = new InputStreamReader(inputStream);

                int data = read.read();


                while (data != -1){
                    char storeData = (char) data;
                    page += storeData;
                    data = read.read();
                }

            }catch (Exception e)
            {
                e.printStackTrace();
                return "cannot featch web page";

            }
            return null;
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SetUpFetch request = new SetUpFetch();

        String page = null;

        try
        {
            page = request.execute("http:// www.HiteshChoudhary.com/").get();

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        Log.i("Stackoverflow",page);
    }
}
