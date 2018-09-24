package com.android.adam.navigation;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

public class ItemFourFragment extends Fragment {
    public static ItemFourFragment newInstance() {
        ItemFourFragment fragment = new ItemFourFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_item_four, container, false);
    }
    FrameLayout i,ii,a,b,c,d,e;
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        i=(FrameLayout)getView().findViewById(R.id.frame1);
        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainIntent =new Intent(getActivity(),VideoListDemoActivity.class);
                startActivity(mainIntent);
            }
        });
        ii=(FrameLayout)getView().findViewById(R.id.frame);
        ii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainIntent =new Intent(getActivity(),VideoListDemoActivity.class);
                startActivity(mainIntent);
            }
        });
        a=(FrameLayout)getView().findViewById(R.id.frame2);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainIntent =new Intent(getActivity(),VideoListDemoActivity.class);
                startActivity(mainIntent);
            }
        });
        b=(FrameLayout)getView().findViewById(R.id.frame3);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainIntent =new Intent(getActivity(),VideoListDemoActivity.class);
                startActivity(mainIntent);
            }
        });
        c=(FrameLayout)getView().findViewById(R.id.frame4);
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainIntent =new Intent(getActivity(),VideoListDemoActivity.class);
                startActivity(mainIntent);
            }
        });
        d=(FrameLayout)getView().findViewById(R.id.frame5);
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainIntent =new Intent(getActivity(),VideoListDemoActivity.class);
                startActivity(mainIntent);
            }
        });
        e=(FrameLayout)getView().findViewById(R.id.frame6);
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainIntent =new Intent(getActivity(),VideoListDemoActivity.class);
                startActivity(mainIntent);
            }
        });



    }
}