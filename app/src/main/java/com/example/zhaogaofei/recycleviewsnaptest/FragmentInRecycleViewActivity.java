package com.example.zhaogaofei.recycleviewsnaptest;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.PagerSnapHelper;
import android.support.v7.widget.RecyclerView;

import com.example.zhaogaofei.recycleviewsnaptest.adapter.AllPageAdapter;
import com.example.zhaogaofei.recycleviewsnaptest.adapter.FragmentInRecycleViewAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * 在RecycleView的item中包含有一个Fragment
 * 这种做法是可行的，但是没必要这么做
 * 这种做法和直接使用布局的方式一致
 */
public class FragmentInRecycleViewActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    public static void start(Context context) {
        Intent intent = new Intent(context, FragmentInRecycleViewActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_in_recycle_view);

        recyclerView = findViewById(R.id.recycle_view_in_fragment);

        initData();
    }

    private void initData() {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            list.add("item position is:" + i);
        }

        FragmentInRecycleViewAdapter adapter = new FragmentInRecycleViewAdapter(this, list);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}
