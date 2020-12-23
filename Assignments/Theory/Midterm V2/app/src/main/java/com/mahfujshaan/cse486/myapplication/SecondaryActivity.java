package com.mahfujshaan.cse486.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondaryActivity extends AppCompatActivity {

  TextView encrypted_text;
  String text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);
        String alpha_key = getIntent().getStringExtra("alpha_key");
        text2 = getIntent().getStringExtra("textMessage");
        String sum_text = alpha_key + " " + text2;
        encrypted_text.setText(sum_text);
    }
}