package com.example.viewpager2_example_2.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.viewpager2_example_2.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class ConfirmedOrdersFragment extends Fragment {

    public ConfirmedOrdersFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_confirmed_orders, container, false);
    }
}
