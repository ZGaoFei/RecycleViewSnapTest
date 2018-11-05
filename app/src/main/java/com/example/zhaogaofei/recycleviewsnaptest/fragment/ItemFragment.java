package com.example.zhaogaofei.recycleviewsnaptest.fragment;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.zhaogaofei.recycleviewsnaptest.R;

import java.util.ArrayList;


public class ItemFragment extends Fragment {
    private String mParams;

    public static ItemFragment newInstance(String params) {
        ItemFragment fragment = new ItemFragment();
        Bundle args = new Bundle();
        args.putString("params", params);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParams = getArguments().getString("params");
        }

        Log.e("zgf", "===item fragment on create==1=" + mParams);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_item, container, false);
        TextView textView = view.findViewById(R.id.tv_item_fragment);
        textView.setText(mParams);

        Log.e("zgf", "===item fragment on create view==2=" + mParams);

        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.e("zgf", "===item fragment on attach==0=" + mParams);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.e("zgf", "===item fragment on activity created==3=" + mParams);
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.e("zgf", "===item fragment on start==4=" + mParams);
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e("zgf", "===item fragment on resume==5=" + mParams);
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.e("zgf", "===item fragment on pause==6=" + mParams);
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.e("zgf", "===item fragment on stop==7=" + mParams);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.e("zgf", "===item fragment on destroy view==8=" + mParams);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e("zgf", "===item fragment on destroy==9=" + mParams);
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.e("zgf", "===item fragment on detach==10=" + mParams);
    }
}
