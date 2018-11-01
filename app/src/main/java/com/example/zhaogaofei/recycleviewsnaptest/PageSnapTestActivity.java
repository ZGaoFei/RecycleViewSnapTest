package com.example.zhaogaofei.recycleviewsnaptest;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.LinearSnapHelper;
import android.support.v7.widget.PagerSnapHelper;
import android.support.v7.widget.RecyclerView;

import com.example.zhaogaofei.recycleviewsnaptest.adapter.LinearSnapAdapter;

import java.util.ArrayList;
import java.util.List;

public class PageSnapTestActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    public static void start(Context context) {
        Intent intent = new Intent(context, PageSnapTestActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_snap_test);

        recyclerView = findViewById(R.id.page_snap_rv);

        initData();
    }

    private void initData() {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            list.add("item position is:" + i);
        }

        LinearSnapAdapter adapter = new LinearSnapAdapter(this, list);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        recyclerView.setAdapter(adapter);

        PagerSnapHelper helper = new PagerSnapHelper();
        helper.attachToRecyclerView(recyclerView);
    }
}
