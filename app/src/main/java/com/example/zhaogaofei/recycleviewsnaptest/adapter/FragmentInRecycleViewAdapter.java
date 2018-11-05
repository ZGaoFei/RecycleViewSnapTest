package com.example.zhaogaofei.recycleviewsnaptest.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.zhaogaofei.recycleviewsnaptest.FragmentInRecycleViewActivity;
import com.example.zhaogaofei.recycleviewsnaptest.R;
import com.example.zhaogaofei.recycleviewsnaptest.fragment.ItemFragment;

import java.util.List;

public class FragmentInRecycleViewAdapter extends RecyclerView.Adapter<FragmentInRecycleViewAdapter.FragmentHolder> {
    private Context mContext;
    private List<String> mList;

    public FragmentInRecycleViewAdapter(Context context, List<String> list) {
        mContext = context;
        if (list != null && !list.isEmpty()) {
            mList = list;
        }
    }

    @NonNull
    @Override
    public FragmentHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_fragment, null, false);

        return new FragmentHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FragmentHolder fragmentHolder, final int i) {
        /*ItemFragment itemFragment = ItemFragment.newInstance(mList.get(i));
        FragmentManager manager = ((FragmentInRecycleViewActivity) mContext).getSupportFragmentManager();
        manager.beginTransaction()
                .replace(R.id.ll_fragment_layout, itemFragment)
                .commit();*/

        View childView = fragmentHolder.linearLayout.getChildAt(0);
        TextView textView = childView.findViewById(R.id.tv_item_fragment);
        textView.setText(mList.get(i));
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, "hahahahah" + i, Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    static class FragmentHolder extends RecyclerView.ViewHolder {
        private LinearLayout linearLayout;

        public FragmentHolder(@NonNull View itemView) {
            super(itemView);

            linearLayout = itemView.findViewById(R.id.ll_fragment_layout);
        }
    }
}
