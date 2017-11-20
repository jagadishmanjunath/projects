package com.example.good.myweatherapp;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

/**
 * Created by good on 11/1/2017.
 */


public class MySingleton
{
    public static MySingleton mInstance;
    private RequestQueue requestQueue;
    private static Context myContext;

    private MySingleton(Context context){
        myContext = context;
        requestQueue = getRequestQueue();
    }

    public RequestQueue getRequestQueue(){
        if (requestQueue == null)
        {
            requestQueue = Volley.newRequestQueue(myContext.getApplicationContext());

        }
        return requestQueue;
    }

    public static synchronized MySingleton getInstance (Context context)
    {
        if(mInstance == null)
        {
            mInstance =new MySingleton(context);
        }
        return mInstance;
    }
    public void addToRequestQueue(Request request)
    {
        requestQueue.add(request);
    }
}
