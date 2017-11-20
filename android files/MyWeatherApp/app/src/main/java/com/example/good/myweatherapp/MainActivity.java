package com.example.good.myweatherapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    Button button;
    EditText city;
    TextView result;

//    http://api.openweathermap.org/data/2.5/weather?q=delhi&appid=830301cbfcfa497e388585c8f06c5f59
   String baseURL= " http://api.openweathermap.org/data/2.5/weather?q";
   String Api = "&appid=830301cbfcfa497e388585c8f06c5f59";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        city =  findViewById(R.id.getCity);
        result =  findViewById(R.id.result);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String myURL = baseURL + city.getText().toString() +Api;
                Log.i ("Url","URL:");

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

                                        String myWeather = parObject.getString("main");
                                        result.setText(myWeather);

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
