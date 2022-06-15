package com.example.rustraid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class CreateShopCalculator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_shop_calculator);
    }

    public void GoToShop(View v) {
        Intent shop = new Intent(this, ShopCalculator.class);
        startActivity(shop);
        finish();
    }

    public void GoToHome(View v) {
        finish();
    }
}