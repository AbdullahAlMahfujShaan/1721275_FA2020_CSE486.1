package com.mahfujshaan.cse486.thefoodtongapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.mahfujshaan.cse486.thefoodtongapp.databinding.ActivityDetailBinding;

public class DetailActivity extends AppCompatActivity {
ActivityDetailBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());



        final DBHelper helper = new DBHelper(this);
        if(getIntent().getIntExtra("type",0)== 1){


 final int image = getIntent().getIntExtra("image",0);
 final int price = Integer.parseInt(getIntent().getStringExtra("price"));
 final String name = getIntent().getStringExtra("name");
 final String description = getIntent().getStringExtra("description");

 binding.detailImage.setImageResource(image);
 binding.priceLabel.setText(String.format("%d",price));
 binding.foodName.setText(name); // nameBox is customer name
 binding.detailDescription.setText(description);


 binding.insertButton.setOnClickListener(v -> {

     boolean isInserted = helper.insertOrder(
             binding.nameBox.getText().toString(),
             binding.phoneBox.getText().toString(),
             price,
             image,
             name,
             description,
             Integer.parseInt(binding.quantity.getText().toString()));

     if (isInserted)
         Toast.makeText(DetailActivity.this, "Success", Toast.LENGTH_SHORT).show();
     else
         Toast.makeText(DetailActivity.this, "ERROR", Toast.LENGTH_SHORT).show();
 });
        }
        else {

        }




    }
}