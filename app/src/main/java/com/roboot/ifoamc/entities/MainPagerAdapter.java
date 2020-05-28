package com.roboot.ifoamc.entities;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.roboot.ifoamc.app.HomeFragment;
import com.roboot.ifoamc.app.SearchFragment;
import com.roboot.ifoamc.app.UserFragment;

public class MainPagerAdapter extends FragmentPagerAdapter
{
    private int nTabs;

    public MainPagerAdapter(FragmentManager fm, int nTabs)
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
                return new HomeFragment();

            case 1:
                return new SearchFragment();

            case 2:
                return new UserFragment();

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
