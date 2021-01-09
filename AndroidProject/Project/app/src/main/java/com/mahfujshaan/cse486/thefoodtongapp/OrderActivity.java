package com.mahfujshaan.cse486.thefoodtongapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.mahfujshaan.cse486.thefoodtongapp.Adapters.OrdersAdapter;
import com.mahfujshaan.cse486.thefoodtongapp.Models.OrdersModel;
import com.mahfujshaan.cse486.thefoodtongapp.databinding.ActivityMainBinding;
import com.mahfujshaan.cse486.thefoodtongapp.databinding.ActivityOrderBinding;

import java.util.ArrayList;

public class OrderActivity extends AppCompatActivity {


    ActivityOrderBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityOrderBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        ArrayList<OrdersModel> list = new ArrayList<>();
        list.add(new OrdersModel(R.drawable.burger, "Cheese Burger", "250", "1234567890"));
        list.add(new OrdersModel(R.drawable.burger, "Cheese Burger", "250", "1234567890"));
        list.add(new OrdersModel(R.drawable.burger, "Cheese Burger", "250", "1234567890"));
        list.add(new OrdersModel(R.drawable.burger, "Cheese Burger", "250", "1234567890"));
        list.add(new OrdersModel(R.drawable.burger, "Cheese Burger", "250", "1234567890"));
        list.add(new OrdersModel(R.drawable.burger, "Cheese Burger", "250", "1234567890"));
        list.add(new OrdersModel(R.drawable.burger, "Cheese Burger", "250", "1234567890"));
        list.add(new OrdersModel(R.drawable.burger, "Cheese Burger", "250", "1234567890"));
        list.add(new OrdersModel(R.drawable.burger, "Cheese Burger", "250", "1234567890"));
        list.add(new OrdersModel(R.drawable.burger, "Cheese Burger", "250", "1234567890"));
        list.add(new OrdersModel(R.drawable.burger, "Cheese Burger", "250", "1234567890"));
        list.add(new OrdersModel(R.drawable.burger, "Cheese Burger", "250", "1234567890"));
        list.add(new OrdersModel(R.drawable.burger, "Cheese Burger", "250", "1234567890"));
        list.add(new OrdersModel(R.drawable.burger, "Cheese Burger", "250", "1234567890"));
        list.add(new OrdersModel(R.drawable.burger, "Cheese Burger", "250", "1234567890"));


        OrdersAdapter adapter = new OrdersAdapter(list, this);
        binding.orderRecyclerView.setAdapter(adapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        binding.orderRecyclerView.setLayoutManager(layoutManager);
    }
}