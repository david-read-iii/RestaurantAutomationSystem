package com.read.restaurantautomationsystem.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.read.restaurantautomationsystem.R;

public class ViewOrderHistoryFragment extends Fragment {

    /**
     * ...
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment_view_order_history, container, false);
        return rootView;
    }
}
