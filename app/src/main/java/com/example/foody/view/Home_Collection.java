package com.example.foody.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.foody.R;
import com.example.foody.adapter.ImageAdapter;
import com.example.foody.adapter.PageCollectionAdapter;
import com.example.foody.adapter.PageSavedAdapter;
import com.google.android.material.tabs.TabLayout;

public class Home_Collection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home__collection);
        final ViewPager viewPager = findViewById(R.id.view_pager);
        ImageAdapter adapter = new ImageAdapter(getApplicationContext());
        viewPager.setAdapter(adapter);

        final ViewPager viewPager1 = findViewById(R.id.view_pager_collection);
        TabLayout tabLayout = findViewById(R.id.tab_collection);
        PageCollectionAdapter pageCollectionAdapter = new PageCollectionAdapter(getSupportFragmentManager(),tabLayout.getTabCount());
        viewPager1.setAdapter(pageCollectionAdapter);
        viewPager1.setCurrentItem(viewPager1.getCurrentItem());
        tabLayout.setupWithViewPager(viewPager1);
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager1.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
}