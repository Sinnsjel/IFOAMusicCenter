package com.roboot.ifoamc.entities;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.roboot.ifoamc.app.SearchCourseFragment;
import com.roboot.ifoamc.app.SearchTeacherFragment;

public class SearchPagerAdapter extends FragmentPagerAdapter
{
    private int nTabs;

    public SearchPagerAdapter(FragmentManager fm, int nTabs)
    {
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        this.nTabs = nTabs;
    }

    @Override
    public Fragment getItem(int position)
    {
        switch (position)
        {
            case 0:
                return new SearchCourseFragment();

            case 1:
                return new SearchTeacherFragment();

            default:
                return null;
        }
    }

    @Override
    public int getCount()
    {
        return nTabs;
    }
}
