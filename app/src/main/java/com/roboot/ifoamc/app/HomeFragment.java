package com.roboot.ifoamc.app;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;
import com.roboot.ifoamc.R;

public class HomeFragment extends Fragment implements View.OnClickListener
{
    private View v;

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {

        v = inflater.inflate(R.layout.fragment_home, container, false);
        return v;
    }

    @Override
    public void onClick(View v)
    {
        Snackbar snack = Snackbar.make(this.v, "CLICCATO", 3000);
    }
}
