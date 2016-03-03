package com.example.riane.producttest;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

/**
 * Created by Xiamu on 2016/3/2.
 */
public class CommentFragment extends Fragment{

    private ListView lv;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_page, container, false);
        lv = (ListView)view.findViewById(R.id.lv);

        MyAdapter myAdapter = new MyAdapter(getActivity());
        lv.setAdapter(myAdapter);

        return view;
    }
}
