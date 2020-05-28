package com.roboot.ifoamc.app;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.roboot.ifoamc.R;

public class SearchTeacherFragment extends Fragment
{

    public SearchTeacherFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,  Bundle savedInstanceState)
    {
        return inflater.inflate(R.layout.fragment_search_teacher, container, false);
    }
}
