package com.example.foody.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.example.foody.adapter.PageSavedAdapter;
import com.example.foody.R;
import com.google.android.material.tabs.TabLayout;

public class Fragment_saved extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v =inflater.inflate(R.layout.activity_saved,container,false);
        TabLayout tabLayout = v.findViewById(R.id.tab_saved);
       final ViewPager viewPager = v.findViewById(R.id.view_pager_saved);
        PageSavedAdapter pageSavedAdapter = new PageSavedAdapter(getChildFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(pageSavedAdapter);
        viewPager.setCurrentItem(viewPager.getCurrentItem());
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        return v;
    }
}
