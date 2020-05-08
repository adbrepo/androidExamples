package com.utn.navigationexample.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.utn.navigationexample.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class WelcomeFragment extends Fragment {

    private View v;

    private Button btnGo;

    public WelcomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_welcome, container, false);

        btnGo = v.findViewById(R.id.btn_go);
        return v;
    }


    @Override
    public void onStart() {
        super.onStart();

        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            WelcomeFragmentDirections.ActionWelcomeFragmentToSecondFragment action = new WelcomeFragmentDirections.ActionWelcomeFragmentToSecondFragment();

                Navigation.findNavController(v).navigate(action);

            }
        });

    }
}
