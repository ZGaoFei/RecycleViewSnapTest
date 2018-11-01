package com.example.zhaogaofei.recycleviewsnaptest;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.PagerSnapHelper;
import android.support.v7.widget.RecyclerView;

import com.example.zhaogaofei.recycleviewsnaptest.adapter.AllPageAdapter;
import com.example.zhaogaofei.recycleviewsnaptest.adapter.LinearSnapAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * 可以做成仿照抖音类似的翻页视频播放
 */
public class AllPageActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    public static void start(Context context) {
        Intent intent = new Intent(context, AllPageActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_page);

        recyclerView = findViewById(R.id.all_page_rv);

        initData();
    }

    private void initData() {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            list.add("item position is:" + i);
        }

        AllPageAdapter adapter = new AllPageAdapter(this, list);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

        PagerSnapHelper helper = new PagerSnapHelper();
        helper.attachToRecyclerView(recyclerView);
    }
}
