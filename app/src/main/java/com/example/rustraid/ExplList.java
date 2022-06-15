package com.example.rustraid;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class ExplList extends AppCompatActivity {

    private ImageView Ex1;
    private ImageView Ex2;
    private ImageView Ex3;
    private ImageView Ex4;
    private ImageView Cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expl_list);

        Ex1 = findViewById(R.id.Ex1);
        Ex2 = findViewById(R.id.Ex2);
        Ex3 = findViewById(R.id.Ex3);
        Ex4 = findViewById(R.id.Ex4);
        Cancel = findViewById(R.id.btn_cancel);

        Ex1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RaidCalculator.idEx.set(RaidCalculator.fEx, 0);
                RaidCalculator.UpdateAdapter();
                finish();
            }
        });
        Ex2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RaidCalculator.idEx.set(RaidCalculator.fEx, 1);
                RaidCalculator.UpdateAdapter();
                finish();
            }
        });
        Ex3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RaidCalculator.idEx.set(RaidCalculator.fEx, 2);
                RaidCalculator.UpdateAdapter();
                finish();
            }
        });
        Ex4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RaidCalculator.idEx.set(RaidCalculator.fEx, 3);
                RaidCalculator.UpdateAdapter();
                finish();
            }
        });
        Cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}