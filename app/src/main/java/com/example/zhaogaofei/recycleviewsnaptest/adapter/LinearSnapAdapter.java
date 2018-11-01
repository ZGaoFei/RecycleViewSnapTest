package com.example.zhaogaofei.recycleviewsnaptest.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.zhaogaofei.recycleviewsnaptest.R;

import java.util.ArrayList;
import java.util.List;

public class LinearSnapAdapter extends RecyclerView.Adapter<LinearSnapAdapter.LinearSnapHolder> {
    private Context mContext;
    private List<String> mList;

    public LinearSnapAdapter(Context context, List<String> list) {
        mContext = context;
        if (mList == null) {
            mList = new ArrayList<>();
        }

        if (list != null) {
            mList.addAll(list);
        }
    }

    @NonNull
    @Override
    public LinearSnapHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_linear_snap, viewGroup, false);

        return new LinearSnapHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LinearSnapHolder linearSnapHolder, int i) {
        linearSnapHolder.textView.setText(mList.get(i));
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    static class LinearSnapHolder extends RecyclerView.ViewHolder {
        private TextView textView;

        public LinearSnapHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.tv_item_linear_snap);
        }
    }
}
