package com.utn.navigationexample.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.utn.navigationexample.R;


public class SecondFragment extends Fragment {


    private View v ;

    private TextView txtLabel;


    public SecondFragment() {
        // Required empty public constructor
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_second, container, false);

        txtLabel = v.findViewById(R.id.txt_label2);
        return v;
    }
}
