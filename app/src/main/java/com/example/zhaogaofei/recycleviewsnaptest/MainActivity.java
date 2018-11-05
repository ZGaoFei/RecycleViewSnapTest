package com.example.zhaogaofei.recycleviewsnaptest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.bt_linear_snap).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LinearSnapTestActivity.start(MainActivity.this);
            }
        });

        findViewById(R.id.bt_page_snap).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PageSnapTestActivity.start(MainActivity.this);
            }
        });

        findViewById(R.id.bt_all_page).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AllPageActivity.start(MainActivity.this);
            }
        });

        findViewById(R.id.bt_fragment_in_recycle).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentInRecycleViewActivity.start(MainActivity.this);
            }
        });
    }
}
