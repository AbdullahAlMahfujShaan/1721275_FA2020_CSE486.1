package com.mahfujshaan.cse486.thefoodtongapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.mahfujshaan.cse486.thefoodtongapp.databinding.ActivityDetailBinding;

public class DetailActivity extends AppCompatActivity {
ActivityDetailBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
 int image = getIntent().getIntExtra("image",0);
 int price = Integer.parseInt(getIntent().getStringExtra("price"));
 String name = getIntent().getStringExtra("name");
 String description = getIntent().getStringExtra("description");

 binding.detailImage.setImageResource(image);
 binding.priceLabel.setText(String.format("%d",price));
 binding.foodName.setText(name); // nameBox is customer name
 binding.detailDescription.setText(description);

    }
}