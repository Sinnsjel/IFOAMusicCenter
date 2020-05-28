package com.roboot.ifoamc.entities;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

import androidx.viewpager.widget.ViewPager;

public class MainViewPager extends ViewPager
{
    public MainViewPager(Context context)
    {
        super(context);
    }

    public MainViewPager(Context context, AttributeSet attrs)
    {
        super(context, attrs);
    }

    @Override
    protected boolean canScroll(View v, boolean checkV, int dx, int x, int y)
    {
        if(v != this && v instanceof ViewPager)
        {
            return false;
        }
        return super.canScroll(v, checkV, dx, x, y);
    }
}
