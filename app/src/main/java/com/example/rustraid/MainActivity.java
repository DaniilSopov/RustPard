package com.example.rustraid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void startRaidCalculator(View v) {
        Intent calculator2 = new Intent(this, CreateRaidCalculator.class);
        startActivity(calculator2);
    }

    public void startShopCalculator(View v) {
        Intent calculator = new Intent(this, CreateShopCalculator.class);
        startActivity(calculator);
    }

}