package com.example.rustraid;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class ResurseList extends AppCompatActivity {

    private ImageView r1;
    private ImageView r2;
    private ImageView r3;
    private ImageView r4;
    private ImageView r5;
    private ImageView r6;
    private ImageView r7;
    private ImageView r8;
    private ImageView Cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resurse_list);

        r1 = findViewById(R.id.r1);
        r2 = findViewById(R.id.r2);
        r3 = findViewById(R.id.r3);
        r4 = findViewById(R.id.r4);
        r5 = findViewById(R.id.r5);
        r6 = findViewById(R.id.r6);
        r7 = findViewById(R.id.r7);
        r8 = findViewById(R.id.r8);
        Cancel = findViewById(R.id.btn_cancel_res);

        r1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RaidCalculator.namesArr.add("Дерево");
                RaidCalculator.idImg.add(0);
                RaidCalculator.idEx.add(0);
                RaidCalculator.countBuild.add(1);
                RaidCalculator.adapter.notifyDataSetChanged();
                finish();
            }
        });
        r2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RaidCalculator.namesArr.add("Камень");
                RaidCalculator.idImg.add(1);
                RaidCalculator.idEx.add(0);
                RaidCalculator.countBuild.add(1);
                RaidCalculator.adapter.notifyDataSetChanged();
                finish();
            }
        });
        r3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RaidCalculator.namesArr.add("Металл");
                RaidCalculator.idImg.add(2);
                RaidCalculator.idEx.add(0);
                RaidCalculator.countBuild.add(1);
                RaidCalculator.adapter.notifyDataSetChanged();
                finish();
            }
        });
        r4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RaidCalculator.namesArr.add("МВК");
                RaidCalculator.idImg.add(3);
                RaidCalculator.idEx.add(0);
                RaidCalculator.countBuild.add(1);
                RaidCalculator.adapter.notifyDataSetChanged();
                finish();
            }
        });
        r5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RaidCalculator.namesArr.add("Деревянная дверь");
                RaidCalculator.idImg.add(4);
                RaidCalculator.idEx.add(0);
                RaidCalculator.countBuild.add(1);
                RaidCalculator.adapter.notifyDataSetChanged();
                finish();
            }
        });
        r6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RaidCalculator.namesArr.add("Металлическая дверь");
                RaidCalculator.idImg.add(5);
                RaidCalculator.idEx.add(0);
                RaidCalculator.countBuild.add(1);
                RaidCalculator.adapter.notifyDataSetChanged();
                finish();
            }
        });
        r7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RaidCalculator.namesArr.add("Гражка");
                RaidCalculator.idImg.add(6);
                RaidCalculator.idEx.add(0);
                RaidCalculator.countBuild.add(1);
                RaidCalculator.adapter.notifyDataSetChanged();
                finish();
            }
        });
        r8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RaidCalculator.namesArr.add("МВК дверь");
                RaidCalculator.idImg.add(7);
                RaidCalculator.idEx.add(0);
                RaidCalculator.countBuild.add(1);
                RaidCalculator.adapter.notifyDataSetChanged();
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