package com.example.foody.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.foody.R;
import com.example.foody.adapter.ViewPagerAdapter_Search;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;

public class Search_Nofication extends AppCompatActivity {
    private TabLayout tabLayout;
    private AppBarLayout appBarLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search__nofication);
        tabLayout = (TabLayout) findViewById(R.id.tablayout_search_id);
        appBarLayout = (AppBarLayout) findViewById(R.id.appbar_search_id);
        viewPager = (ViewPager) findViewById(R.id.viewpager_search_id) ;
        ViewPagerAdapter_Search adapter_search = new ViewPagerAdapter_Search(getSupportFragmentManager());
        adapter_search.AddFragment(new Recentview_Search_Nofication(),"Xem gần đây");
        adapter_search.AddFragment(new RecentBook_Search_Nofication(),"Đặt gần đây");
        adapter_search.AddFragment(new Place_Search_Nofication(), "Địa điểm đã tìm");
        viewPager.setAdapter(adapter_search);
        tabLayout.setupWithViewPager(viewPager);
    }
}