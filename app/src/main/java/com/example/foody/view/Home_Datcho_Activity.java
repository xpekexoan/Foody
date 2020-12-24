package com.example.foody.view;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import com.example.foody.R;
import com.example.foody.adapter.ViewPagerAdapter_Search;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;

public class Home_Datcho_Activity extends AppCompatActivity {
    private TabLayout tabLayout;
    private AppBarLayout appBarLayout;
    private ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home__datcho_);
        tabLayout = (TabLayout) findViewById(R.id.tablayout_datcho_id);
        appBarLayout = (AppBarLayout) findViewById(R.id.appbar_datcho_id);
        viewPager = (ViewPager) findViewById(R.id.viewpager_datcho_id) ;
        ViewPagerAdapter_Search adapter_datcho = new ViewPagerAdapter_Search(getSupportFragmentManager());
        adapter_datcho.AddFragment(new NoiBat_Datcho_Home(),"Nổi bật");
        adapter_datcho.AddFragment(new Datnhieu_Datcho_Home(),"Đặt nhiều");
        adapter_datcho.AddFragment(new Moi_Datcho_Home(), "Mới");
        adapter_datcho.AddFragment(new Gantoi_Datcho_Home(), "Gần tôi");
        viewPager.setAdapter(adapter_datcho);
        tabLayout.setupWithViewPager(viewPager);
    }
}