package com.instiki.dkotama.pertemuansembilanlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.instiki.dkotama.pertemuansembilanlistview.data.DataSource;

public class BasicListView extends AppCompatActivity {
    ListView basicListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_list_view);

        basicListView = findViewById(R.id.basic_listview);

        ArrayAdapter<String> basicAdapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_list_item_1, DataSource.CAR_STRINGS);

        basicListView.setAdapter(basicAdapter);


    }
}