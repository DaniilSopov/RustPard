package com.example.rustraid;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;


class ListViewAdapter extends ArrayAdapter<String> {
    ArrayList<String> list;
    Context context;
    int i = 1;

    public ListViewAdapter(Context context, ArrayList<String> namesArr) {
        super(context, R.layout.built_item, namesArr);
        this.context = context;
        list = namesArr;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        if (convertView == null) {
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.built_item, null);

            ImageView imgBuild = convertView.findViewById(R.id.ImgBuild);
            imgBuild.setImageResource(RaidCalculator.imgArrBuild[RaidCalculator.idImg.get(position)]);

            ImageView imgEx = convertView.findViewById(R.id.img_res);
            imgEx.setImageResource(RaidCalculator.imgArrEx[RaidCalculator.idEx.get(position)]);
            imgEx.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    RaidCalculator.fEx = position;
                    GoToEx();
                }
            });

            TextView name = convertView.findViewById(R.id.name_build);
            name.setText(list.get(position));
            name.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    RaidCalculator.UpdateAdapter();
                }
            });

            EditText count = convertView.findViewById(R.id.countBuild);
            count.setText(RaidCalculator.countBuild.get(position).toString());
            count.setOnKeyListener(new View.OnKeyListener() {
                @Override
                public boolean onKey(View view, int keyCode, KeyEvent event) {
                    {
                        if (event.getAction() == KeyEvent.ACTION_DOWN &&
                                (keyCode == KeyEvent.KEYCODE_ENTER)) {
                            InputMethodManager imm = (InputMethodManager) context.getSystemService(Context.INPUT_METHOD_SERVICE);
                            imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
                            // сохраняем текст, введённый до нажатия Enter в переменную
                            RaidCalculator.countBuild.set(position, Integer.parseInt(count.getText().toString()));
                            RaidCalculator.UpdateAdapter();

                            return true;
                        }
                        return false;
                    }
                }
            });

            Button btn_delet = convertView.findViewById(R.id.btn_close);
            //TextView countBuild = convertView.findViewById(R.id.countBuild);
            Button btn_plus = convertView.findViewById(R.id.btn_plus);
            btn_delet.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String b = count.getText().toString();
                    int i = Integer.parseInt(b);
                    if (i > 1) {
                        i--;
                        count.setText(String.valueOf(i));
                        RaidCalculator.countBuild.set(position, i);
                        RaidCalculator.UpdateAdapter();
                    } else {
                        RaidCalculator.deletItem(position);
                    }
                }
            });


            View.OnClickListener plus = new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String b = count.getText().toString();
                    int i = Integer.parseInt(b);
                    if (i < 99) {
                        i++;
                        count.setText(String.valueOf(i));
                        RaidCalculator.countBuild.set(position, i);
                        RaidCalculator.UpdateAdapter();
                    }
                }
            };

            btn_plus.setOnClickListener(plus);


        }
        return convertView;
    }

    public void GoToEx() {
        Intent Exp = new Intent(ListViewAdapter.this.context, ExplList.class);
        context.startActivity(Exp);
    }
}
