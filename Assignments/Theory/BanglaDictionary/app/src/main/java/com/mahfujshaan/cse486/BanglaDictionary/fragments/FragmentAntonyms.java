package com.mahfujshaan.cse486.BanglaDictionary.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.mahfujshaan.cse486.BanglaDictionary.R;

public class FragmentAntonyms extends Fragment {
   public FragmentAntonyms() {
}
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        View view = inflater.inflate(R.layout.fragment_definition,container, false);
        return view;

    }
}