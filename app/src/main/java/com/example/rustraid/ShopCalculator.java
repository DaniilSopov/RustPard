package com.example.rustraid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ShopCalculator extends AppCompatActivity {

    static int[] imgSolds = {R.drawable.metalr, R.drawable.mvkr, R.drawable.oil, R.drawable.keycardg, R.drawable.keycardb, R.drawable.keycardr, R.drawable.tkan, R.drawable.fertilazer, R.drawable.corn, R.drawable.fish};
    static ImageView imgSold;
    static ImageView imgScrap;
    static TextView countScrap;
    static EditText countSold;

    static int price = 0;
    static int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop_calculator);
        Button btn_delet = findViewById(R.id.btn_close);
        Button btn_plus = findViewById(R.id.btn_plus);

        imgSold = findViewById(R.id.imgSold);
        imgScrap = findViewById(R.id.imgScrap);
        countScrap = findViewById(R.id.countScrap);
        countSold = findViewById(R.id.inputSould);

        imgScrap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calculation();
            }
        });
        countSold.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent event) {
                {
                    if (event.getAction() == KeyEvent.ACTION_DOWN &&
                            (keyCode == KeyEvent.KEYCODE_ENTER)) {
                        InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                        imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
                        Calculation();
                        return true;
                    }
                    return false;
                }
            }
        });

        btn_delet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String b = countSold.getText().toString();
                int i = Integer.parseInt(b);
                if (i > 1) {
                    i--;
                    countSold.setText(String.valueOf(i));
                    Calculation();
                }
            }
        });

        btn_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String b = countSold.getText().toString();
                int i = Integer.parseInt(b);
                if (i < 99999) {
                    i++;
                    countSold.setText(String.valueOf(i));
                    Calculation();
                }
            }
        });
        OpenSold(findViewById(R.id.imgSold));
    }


    public void GoToHome(View v) {
        finish();
    }

    public void OpenSold(View v) {
        Intent result = new Intent(this, ListSold.class);
        startActivity(result);
    }

    public static void Calculation() {
        if (!countSold.getText().toString().isEmpty() && count != 0) {
            countScrap.setText("" + ((Integer.parseInt(countSold.getText().toString()) / count) * price));
        } else {
            countScrap.setText("0");
        }
    }
}