package com.apkzube.blindvision.fragment;



import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.apkzube.blindvision.R;

/**
 * Color Detection
 * Created by Vishal Nagvadiya on 24-05-2020.
 */

public class ColorDetectionFragment extends Fragment {

    public ColorDetectionFragment() {
        // Required empty public constructor
    }

    public static Fragment newInstance() {
        return new ColorDetectionFragment();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_color_detection, container, false);
    }
}
