package com.mahfujshaan.cse486.headsetevents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
private SecondaryActivity secondaryActivity = new SecondaryActivity();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(Intent.ACTION_HEADSET_PLUG);
        this.registerReceiver(secondaryActivity, intentFilter);
    }

    @Override
    protected void onDestroy(){
        this.unregisterReceiver(secondaryActivity);
        super.onDestroy();
    }
}