package com.example.good.volleyfour;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {


    String myURL = "http://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b1b15e88fa797225412429c1c50c122a1";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button = findViewById(R.id.buttonapi);
        button.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                Log.i("tapped","Tapped");

                final JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.GET, myURL, null,
                        new Response.Listener<JSONObject>() {
                            @Override
                            public void onResponse(JSONObject response) {
                            Log.i("json","json" + response);


                                try {
                                    String info = response.getString("weather");
                                    Log.i("Info","info" + info);

                                    JSONArray ar= new JSONArray(info);

                                    for (int i =0; i<ar.length(); i++)
                                    {
                                        JSONObject parObject = ar.getJSONObject(i);

                                        Log.i("Id","Id" + parObject.getString("id"));
                                        Log.i("Main","Main" + parObject.getString("Main"));
                                    }
                                }
                                    catch (JSONException e)
                                    {
                                    e.printStackTrace();
                                    }

//                            try {
//                                String coor = response.getString("cord");
//                                Log.i("COOR","COOR:" + coor);
//                                JSONObject co = new JSONObject(coor);
//                                String lon = co.getString("lon");
//                                String lat = co.getString("lat");
//                                Log.i("lon","lon:" + lon);
//                                Log.i("lat","lat:" + lat);
//
//                            }catch (JSONException e){
//                                e.printStackTrace();
//                            }
                            }
                        },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                               Log.i("Error","Something went wrong" +error) ;
                            }
                        }

                );
                 MySingleton.getInstance(MainActivity.this).addToRequestQueue(jsonObjectRequest);

            }
        });
    }
}
