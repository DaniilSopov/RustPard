package com.example.rustraid;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Resultate extends AppCompatActivity {

    static ListView listView;
    private ImageView btn_back;
    static ArrayList<String> resArr;
    static ArrayList<Integer> countRes;

    static ListViewAdapterRes adapter;

    static int[] imgArrRes = {R.drawable.sera, R.drawable.metalr, R.drawable.tkan, R.drawable.toplivo, R.drawable.mikroshem, R.drawable.truba, R.drawable.verevka, R.drawable.ygol};
    static ArrayList<Integer> idres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultate);

        idres = new ArrayList<>();
        countRes = new ArrayList<>();
        resArr = new ArrayList<>();

        listView = findViewById(R.id.resList);
        btn_back = findViewById(R.id.btn_cancel_result);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


        adapter = new ListViewAdapterRes(this, resArr);
        listView.setAdapter(adapter);


        idres.add(0);
        resArr.add("Сера");
        countRes.add(0);
        idres.add(1);
        resArr.add("Металл");
        countRes.add(0);
        idres.add(2);
        resArr.add("Ткань");
        countRes.add(0);
        idres.add(3);
        resArr.add("Топливо");
        countRes.add(0);
        idres.add(4);
        resArr.add("Микросхемы");
        countRes.add(0);
        idres.add(5);
        resArr.add("Трубы");
        countRes.add(0);
        idres.add(6);
        resArr.add("Веревки");
        countRes.add(0);
        idres.add(7);
        resArr.add("Уголь");
        countRes.add(0);
        Calculate();
    }

    public static void UpdateAdapter() {
        listView.setAdapter(adapter);
    }

    public void Calculate() {
        if (!RaidCalculator.idEx.isEmpty()) {
            for (int i = 0; i < RaidCalculator.idEx.size(); i++) {
                int countE = 0;
                switch (RaidCalculator.idEx.get(i)) {
                    case 0:
                        switch (RaidCalculator.idImg.get(i)) {
                            case 0:
                                countE = 2;
                                break;
                            case 1:
                                countE = 4;
                                break;
                            case 2:
                                countE = 8;
                                break;
                            case 3:
                                countE = 15;
                                break;
                            case 4:
                                countE = 1;
                                break;
                            case 5:
                                countE = 2;
                                break;
                            case 6:
                                countE = 3;
                                break;
                            case 7:
                                countE = 4;
                                break;
                        }
                        for (int j = 0; j < RaidCalculator.countBuild.get(i); j++) {
                            countRes.set(0, (countRes.get(0) + 1400 * countE));
                            countRes.set(1, (countRes.get(1) + 100 * countE));
                            countRes.set(3, (countRes.get(3) + 30 * countE));
                            countRes.set(5, (countRes.get(5) + 2 * countE));
                            countRes.set(7, (countRes.get(7) + 1950 * countE));
                        }
                        break;
                    case 1:
                        switch (RaidCalculator.idImg.get(i)) {
                            case 0:
                                countE = 1;
                                break;
                            case 1:
                                countE = 2;
                                break;
                            case 2:
                                countE = 4;
                                break;
                            case 3:
                                countE = 8;
                                break;
                            case 4:
                                countE = 1;
                                break;
                            case 5:
                                countE = 1;
                                break;
                            case 6:
                                countE = 2;
                                break;
                            case 7:
                                countE = 2;
                                break;
                        }
                        for (int j = 0; j < RaidCalculator.countBuild.get(i); j++) {
                            countRes.set(0, (countRes.get(0) + 2200 * countE));
                            countRes.set(1, (countRes.get(1) + 200 * countE));
                            countRes.set(2, (countRes.get(2) + 5 * countE));
                            countRes.set(3, (countRes.get(3) + 60 * countE));
                            countRes.set(4, (countRes.get(4) + 2 * countE));
                            countRes.set(7, (countRes.get(7) + 3000 * countE));
                        }
                        break;
                    case 2:
                        switch (RaidCalculator.idImg.get(i)) {
                            case 0:
                                countE = 3;
                                break;
                            case 1:
                                countE = 10;
                                break;
                            case 2:
                                countE = 23;
                                break;
                            case 3:
                                countE = 46;
                                break;
                            case 4:
                                countE = 2;
                                break;
                            case 5:
                                countE = 4;
                                break;
                            case 6:
                                countE = 9;
                                break;
                            case 7:
                                countE = 12;
                                break;
                        }
                        for (int j = 0; j < RaidCalculator.countBuild.get(i); j++) {
                            countRes.set(0, (countRes.get(0) + 480 * countE));
                            countRes.set(1, (countRes.get(1) + 80 * countE));
                            countRes.set(2, (countRes.get(2) + 10 * countE));
                            countRes.set(6, (countRes.get(6) + countE));
                            countRes.set(7, (countRes.get(7) + 720 * countE));
                        }
                        break;
                    case 3:
                        switch (RaidCalculator.idImg.get(i)) {
                            case 0:
                                countE = 60;
                                break;
                            case 1:
                                countE = 222;
                                break;
                            case 2:
                                countE = 399;
                                break;
                            case 3:
                                countE = 800;
                                break;
                            case 4:
                                countE = 26;
                                break;
                            case 5:
                                countE = 63;
                                break;
                            case 6:
                                countE = 200;
                                break;
                            case 7:
                                countE = 334;
                                break;
                        }
                        for (int j = 0; j < RaidCalculator.countBuild.get(i); j++) {
                            countRes.set(0, (countRes.get(0) + 25 * countE));
                            countRes.set(1, (countRes.get(1) + 5 * countE));
                            countRes.set(7, (countRes.get(7) + 30 * countE));
                        }
                        break;
                }
            }
        }
        for (int i = idres.size() - 1; i > -1; i--) {
            if (countRes.get(i) == 0) {
                idres.remove(i);
                resArr.remove(i);
                countRes.remove(i);
            }
        }
        UpdateAdapter();
    }
}