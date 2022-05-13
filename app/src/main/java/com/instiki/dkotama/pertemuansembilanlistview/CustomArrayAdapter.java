package com.instiki.dkotama.pertemuansembilanlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.instiki.dkotama.pertemuansembilanlistview.data.Car;

public class CustomArrayAdapter extends ArrayAdapter<Car> {

    public CustomArrayAdapter(@NonNull Context context, @NonNull Car[] objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View currentItemView = convertView;

        // set view adapter menggunakan custom_listview_item
        if (currentItemView == null) {
            currentItemView = LayoutInflater.from(getContext()).inflate(R.layout.custom_listview_item, parent, false);
        }

        // mendapatkan isi CAR dari Array Adapter
        Car currentCar = getItem(position);

        // setelah mendapatkan posisi CAR , set gambar imageview
        ImageView customViewImage = currentItemView.findViewById(R.id.custom_list_imageview);
        if (currentCar!=null) customViewImage.setImageResource(currentCar.getImage());

        // setelah mendapatkan posisi CAR, set title car
        TextView carTitleTextView = currentItemView.findViewById(R.id.custom_listview_title_textview);
        if (currentCar!=null) carTitleTextView.setText(currentCar.getName());

        // return view yang sudah diisikan info masing-masing car
        return currentItemView;
    }
}
