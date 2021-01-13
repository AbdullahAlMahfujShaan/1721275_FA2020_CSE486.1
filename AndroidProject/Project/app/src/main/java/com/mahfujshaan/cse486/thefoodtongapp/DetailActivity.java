package com.mahfujshaan.cse486.thefoodtongapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.mahfujshaan.cse486.thefoodtongapp.databinding.ActivityDetailBinding;

public class DetailActivity extends AppCompatActivity {
ActivityDetailBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
 final int image = getIntent().getIntExtra("image",0);
 final int price = Integer.parseInt(getIntent().getStringExtra("price"));
 final String name = getIntent().getStringExtra("name");
 final String description = getIntent().getStringExtra("description");

 binding.detailImage.setImageResource(image);
 binding.priceLabel.setText(String.format("%d",price));
 binding.foodName.setText(name); // nameBox is customer name
 binding.detailDescription.setText(description);
final DBHelper helper = new DBHelper(this);

 binding.insertButton.setOnClickListener(new View.OnClickListener() {
     @Override
     public void onClick(View v) {

     boolean isInserted =   helper.insertOrder(binding.nameBox.getText().toString(),
                 binding.phoneBox.getText().toString(),
                 price,
                 image,
                 name,
                 description,
         Integer.parseInt(binding.quantity.getText().toString()));
     }
 });

    }
}