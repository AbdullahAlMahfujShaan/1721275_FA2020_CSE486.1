package com.mahfujshaan.cse486.thefoodtongapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
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
            final int id = getIntent().getIntExtra("id", 0);
            Cursor cursor = helper.getOrderById(id);
            final int image =cursor.getInt(4);

            binding.detailImage.setImageResource(image);
            binding.priceLabel.setText(String.format("%d",cursor.getInt(3)));
            binding.foodName.setText(cursor.getString(6)); // nameBox is customer name
            binding.detailDescription.setText(cursor.getString(5));


            binding.nameBox.setText(cursor.getString(1));
            binding.phoneBox.setText(cursor.getString(2));
            binding.insertButton.setText("Update Now");
            binding.insertButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    boolean isUpdated = helper.updateOrder(
        binding.nameBox.getText().toString(),
        binding.phoneBox.getText().toString(),
        Integer.parseInt(binding.priceLabel.getText().toString()),
        image,
        binding.detailDescription.getText().toString(),
        binding.foodName.getText().toString(),
1,
        id
        );
if(isUpdated)
    Toast.makeText(DetailActivity.this, "Updated", Toast.LENGTH_SHORT).show();
else
    Toast.makeText(DetailActivity.this, "Failed", Toast.LENGTH_SHORT).show();
                }

            });
        }

    }
}