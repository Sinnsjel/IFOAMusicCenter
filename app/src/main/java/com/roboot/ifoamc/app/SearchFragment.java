package com.roboot.ifoamc.app;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.util.Log;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.roboot.ifoamc.R;
import com.roboot.ifoamc.entities.SearchPagerAdapter;
import com.roboot.ifoamc.entities.ViewPagerFisso;

public class SearchFragment extends Fragment implements GestureDetector.OnGestureListener, View.OnTouchListener
{
    private static final float VELOCITY_THRESHOLD = 3000;
    private SearchPagerAdapter searchPagerAdapter;
    private View v;
    private int pageIndex;
    private GestureDetector gDetector;
    private ViewPagerFisso searchPager;

    public SearchFragment() {
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
        pageIndex = 0;
        v = inflater.inflate(R.layout.fragment_search, container, false);
        searchPagerAdapter = new SearchPagerAdapter(getFragmentManager(), 2);
        searchPager = (ViewPagerFisso) v.findViewById(R.id.searchPager);
        searchPager.setAdapter(searchPagerAdapter);
        gDetector = new GestureDetector(getActivity(), this);
        searchPager.setOnTouchListener(this);
        return v;
    }

    @Override
    public boolean onDown(MotionEvent e)
    {
        return true;
    }

    @Override
    public void onShowPress(MotionEvent e) { }

    @Override
    public boolean onSingleTapUp(MotionEvent e) { return false; }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) { return false; }

    @Override
    public void onLongPress(MotionEvent e) { }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY)
    {

        if(Math.abs(velocityX) < VELOCITY_THRESHOLD && Math.abs(velocityY) < VELOCITY_THRESHOLD)
        {
            return false;
        }

        if(Math.abs(velocityX) < Math.abs(velocityY))
        {
            if (velocityY <= 0)
            {
                pageIndex = (pageIndex == 0 ? 1 : 0);
                Log.i("MSG:", "SWIPATO in alto " + pageIndex);
                searchPager.setCurrentItem(pageIndex);
            }
        }

        return true;
    }

    @Override
    public boolean onTouch(View v, MotionEvent event)
    {
        return gDetector.onTouchEvent(event);
    }
}
