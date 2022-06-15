package com.example.rustraid;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

class ListViewAdapterRes extends ArrayAdapter<String> {
    ArrayList<String> list;
    Context context;

    public ListViewAdapterRes(Context context, ArrayList<String> resArr) {
        super(context, R.layout.res_item, resArr);
        this.context = context;
        list = resArr;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.res_item, null);

            ImageView imgRes = convertView.findViewById(R.id.img_res);
            imgRes.setImageResource(Resultate.imgArrRes[Resultate.idres.get(position)]);

            TextView name = convertView.findViewById(R.id.name_res);
            name.setText(list.get(position));

            TextView count = convertView.findViewById(R.id.count_res);
            count.setText(Resultate.countRes.get(position).toString());
        }
        return convertView;
    }
}
