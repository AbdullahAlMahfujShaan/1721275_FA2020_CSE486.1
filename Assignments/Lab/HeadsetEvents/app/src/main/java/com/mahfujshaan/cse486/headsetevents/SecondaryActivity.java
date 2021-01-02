package com.mahfujshaan.cse486.headsetevents;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class SecondaryActivity extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent){
        String intentAction = intent.getAction();
        if(intentAction != null){
            Toast.makeText(context, "Headphones have been unplugged or plugged", Toast.LENGTH_LONG).show();
        }
    }
}
