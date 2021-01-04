package com.mahfujshaan.cse486.thefoodtongapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.mahfujshaan.cse486.thefoodtongapp.Models.MainModel;
import com.mahfujshaan.cse486.thefoodtongapp.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        ArrayList<MainModel> list = new ArrayList<>();
        list.add(new MainModel(R.drawable.burger, "Burger", "250", "Cheese Burger garnished with Tomato and Honey Mustard"));

       //Add Photos and Fix
        list.add(new MainModel(R.drawable.pizza, "Burger", "250", "Cheese Burger garnished with Tomato and Honey Mustard"));
        list.add(new MainModel(R.drawable.hotdog, "Burger", "250", "Cheese Burger garnished with Tomato and Honey Mustard"));
        list.add(new MainModel(R.drawable.burger, "Burger", "250", "Cheese Burger garnished with Tomato and Honey Mustard"));
        list.add(new MainModel(R.drawable.burger, "Burger", "250", "Cheese Burger garnished with Tomato and Honey Mustard"));
        list.add(new MainModel(R.drawable.burger, "Burger", "250", "Cheese Burger garnished with Tomato and Honey Mustard"));
        list.add(new MainModel(R.drawable.burger, "Burger", "250", "Cheese Burger garnished with Tomato and Honey Mustard"));


    }
}