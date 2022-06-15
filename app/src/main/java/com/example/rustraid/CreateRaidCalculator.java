package com.example.rustraid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class CreateRaidCalculator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_raid_calculator);
    }

    public void GoToRaid(View v) {
        Intent raid = new Intent(this, RaidCalculator.class);
        startActivity(raid);
        finish();
    }

    public void GoToHome(View v) {
        finish();
    }
}