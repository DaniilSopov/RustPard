package com.example.rustraid;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class ListSold extends AppCompatActivity {

    private ImageView img1, img2, img3, img4, img5, img6, img7, img8, img9, img10, button;
    private View.OnClickListener lis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_sold);

        img1 = findViewById(R.id.imgSold1);
        img2 = findViewById(R.id.imgSold2);
        img3 = findViewById(R.id.imgSold3);
        img4 = findViewById(R.id.imgSold4);
        img5 = findViewById(R.id.imgSold5);
        img6 = findViewById(R.id.imgSold6);
        img7 = findViewById(R.id.imgSold7);
        img8 = findViewById(R.id.imgSold8);
        img9 = findViewById(R.id.imgSold9);
        img10 = findViewById(R.id.imgSold10);
        button = findViewById(R.id.button);

        lis = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.imgSold1:
                        SelectSold(0, 1, 20);
                        break;
                    case R.id.imgSold2:
                        SelectSold(1, 2, 1);
                        break;
                    case R.id.imgSold3:
                        SelectSold(2, 1, 6);
                        break;
                    case R.id.imgSold4:
                        SelectSold(3, 15, 1);
                        break;
                    case R.id.imgSold5:
                        SelectSold(4, 40, 1);
                        break;
                    case R.id.imgSold6:
                        SelectSold(5, 80, 1);
                        break;
                    case R.id.imgSold7:
                        SelectSold(6, 10, 80);
                        break;
                    case R.id.imgSold8:
                        SelectSold(7, 3, 2);
                        break;
                    case R.id.imgSold9:
                        SelectSold(8, 10, 15);
                        break;
                    case R.id.imgSold10:
                        SelectSold(9, 5, 1);
                        break;

                }
            }
        };
        img1.setOnClickListener(lis);
        img2.setOnClickListener(lis);
        img3.setOnClickListener(lis);
        img4.setOnClickListener(lis);
        img5.setOnClickListener(lis);
        img6.setOnClickListener(lis);
        img7.setOnClickListener(lis);
        img8.setOnClickListener(lis);
        img9.setOnClickListener(lis);
        img10.setOnClickListener(lis);
    }

    public void GoToHome(View v) {
        finish();
    }

    public void SelectSold(int id, int p, int c) {
        ShopCalculator.imgSold.setImageResource(ShopCalculator.imgSolds[id]);
        ShopCalculator.price = p;
        ShopCalculator.count = c;
        ShopCalculator.countSold.setText("1");
        ShopCalculator.Calculation();
        finish();
    }


}