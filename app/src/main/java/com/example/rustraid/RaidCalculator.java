package com.example.rustraid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class RaidCalculator extends AppCompatActivity {

    static ListView listView;
    private Button add_item;
    private Button btn_delet;
    private Button btn_plus;
    private Button btn_result;
    private TextView name_build;
    static int fEx;

    static int[] imgArrBuild = {R.drawable.wood, R.drawable.stone, R.drawable.metal, R.drawable.mvk, R.drawable.wooddoor, R.drawable.metaldoor, R.drawable.garage, R.drawable.mvkdoor};
    static int[] imgArrEx = {R.drawable.rocket, R.drawable.cfor, R.drawable.sachel, R.drawable.ammo};
    static ArrayList<Integer> idImg;
    static ArrayList<Integer> idEx;
    static ArrayList<Integer> countBuild;

    static ArrayList<String> namesArr;
    static ListViewAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_raid_calculator);

        //
        // add_item = findViewById(R.id.btn_add);
        listView = findViewById(R.id.listBuild);
        btn_delet = findViewById(R.id.btn_close);
        btn_result = findViewById(R.id.btn_result);
        add_item = findViewById(R.id.btn_add);


        idImg = new ArrayList<>();
        idEx = new ArrayList<>();
        countBuild = new ArrayList<>();
        namesArr = new ArrayList<>();

        /*
        idImg.add(0);
        idEx.add(0);
        countBuild.add(1);
        namesArr.add("324");
        */

        adapter = new ListViewAdapter(this, namesArr);
        listView.setAdapter(adapter);
        GoToResurse(add_item);
    }

    public static void deletItem(int remove) {
        namesArr.remove(remove);
        idImg.remove(remove);
        idEx.remove(remove);
        countBuild.remove(remove);
        listView.setAdapter(adapter);
    }


    public void GoToResurse(View v) {
        Intent resurse = new Intent(this, ResurseList.class);
        startActivity(resurse);
    }

    public void GoToResult(View v) {
        if (!idImg.isEmpty()) {
            Intent result = new Intent(this, Resultate.class);
            startActivity(result);
        } else {
            GoToResurse(btn_result);
        }
    }

    public static void UpdateAdapter() {
        listView.setAdapter(adapter);
    }

    public void GoToHome(View v) {
        finish();
        //Intent home = new Intent(this, MainActivity.class);
        //startActivity(home);
    }
}