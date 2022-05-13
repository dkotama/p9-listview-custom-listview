package com.instiki.dkotama.pertemuansembilanlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.instiki.dkotama.pertemuansembilanlistview.data.DataSource;

public class CustomListView extends AppCompatActivity {
    ListView customListView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list_view);

        customListView = findViewById(R.id.custom_listview);

        CustomArrayAdapter customAdapter = new CustomArrayAdapter(this, DataSource.CARS);

        customListView.setAdapter(customAdapter);


    }
}