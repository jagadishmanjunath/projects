package com.example.good.volleytwo;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

/**
 * Created by good on 10/31/2017.
 */

public class Mysingleton
{
    public static Mysingleton mInstance;
    private RequestQueue requestQueue;
    private static Context myContext;

    private Mysingleton(Context context){
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

    public static synchronized Mysingleton getInstance (Context context)
    {
        if(mInstance == null)
        {
            mInstance =new Mysingleton(context);
        }
        return mInstance;
    }
    public void addToRequestQueue(Request request)
    {
        requestQueue.add(request);
    }
}
