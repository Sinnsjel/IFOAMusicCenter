package com.roboot.ifoamc.entities;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

import androidx.viewpager.widget.ViewPager;

public class ViewPagerFisso extends ViewPager
{


    public ViewPagerFisso(Context context) {
        super(context);
    }

    public ViewPagerFisso(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event)
    {
        return false;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent event)
    {
        return false;
    }
}
