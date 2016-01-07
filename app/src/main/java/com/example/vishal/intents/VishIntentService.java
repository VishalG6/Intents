package com.example.vishal.intents;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;


public class VishIntentService extends IntentService{

    private static final String TAG = "com.example.vishal.intents";

    public VishIntentService() {
        super("VishIntentService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        //This is what the service does.

        Log.i(TAG,"The service has started");
    }



}
