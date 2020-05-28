package com.roboot.ifoamc.app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import android.os.Bundle;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;
import com.roboot.ifoamc.entities.MainPagerAdapter;
import com.roboot.ifoamc.R;
import com.roboot.ifoamc.entities.MainViewPager;

public class MainActivity extends AppCompatActivity implements TabLayout.OnTabSelectedListener
{

    private TabLayout tabLayout;
    private TabItem homeTab, searchTab, userTab;
    private MainViewPager mainPager;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buildLayout();
    }

    private void buildLayout()
    {
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        homeTab = (TabItem) findViewById(R.id.homeTab);
        searchTab = (TabItem) findViewById(R.id.searchTab);
        userTab = (TabItem) findViewById(R.id.userTab);
        mainPager = (MainViewPager) findViewById(R.id.mainPager);
        final MainPagerAdapter mainPagerAdapter = new MainPagerAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        mainPager.setAdapter(mainPagerAdapter);
        mainPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(this);
    }

    // implementazione metodi OnTabSelectedListener

    @Override
    public void onTabSelected(TabLayout.Tab tab)
    {
        mainPager.setCurrentItem(tab.getPosition());
    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab)
    {

    }

    @Override
    public void onTabReselected(TabLayout.Tab tab)
    {

    }
}
