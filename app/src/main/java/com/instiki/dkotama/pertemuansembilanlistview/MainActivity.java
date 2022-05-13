package com.instiki.dkotama.pertemuansembilanlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.instiki.dkotama.pertemuansembilanlistview.data.DataSource;

public class MainActivity extends AppCompatActivity {
    Button btnIteration, btnBasicListView, btnCustomListView;
    TextView hasilIterasiTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnIteration = findViewById(R.id.iteration_btn);
        btnBasicListView = findViewById(R.id.listview_sample_btn);
        btnCustomListView = findViewById(R.id.customlistview_btn);

        hasilIterasiTextView = findViewById(R.id.array_result_textview);

        btnIteration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               String iterationResult = "";

                for (int i = 0; i < DataSource.CAR_STRINGS.length ; i++) {
                    iterationResult += i + 1 + ". ";
                    iterationResult += DataSource.CAR_STRINGS[i] + "\n";
                }

                hasilIterasiTextView.setText(iterationResult);
            }
        });



        btnBasicListView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // goto basic listview
            }
        });

        btnCustomListView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // goto custom listview
            }
        });
    }
}