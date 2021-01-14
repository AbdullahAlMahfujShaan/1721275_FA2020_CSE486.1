package com.mahfujshaan.cse486.thefoodtongapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.mahfujshaan.cse486.thefoodtongapp.Adapters.MainAdapter;
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
        list.add(new MainModel(R.drawable.pizza, "Pizza", "550", "Margarita, Cheese, BBQ Chicken Pizza"));
        list.add(new MainModel(R.drawable.hotdog, "HotDog", "200", "HotDog served with 2 sausages"));
        list.add(new MainModel(R.drawable.khichuri, "Khichuri", "120", "Vegetable Khichuri with Omlette"));
        list.add(new MainModel(R.drawable.paratha, "Aloo Paratha", "60", "Seasonal Aloo Paratha"));
        list.add(new MainModel(R.drawable.pasta, "Pasta", "250", "Oven Baked Chicken/Beef Pasta"));
        list.add(new MainModel(R.drawable.sweets, "Sweets", "350", "Different kinds of sweets"));

        MainAdapter adapter = new MainAdapter(list, this);
        binding.recyclerView.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        binding.recyclerView.setLayoutManager(layoutManager);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.orders:
                startActivity(new Intent(MainActivity.this, OrderActivity.class));
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}