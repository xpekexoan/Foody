package com.example.foody.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.foody.R;
import com.example.foody.adapter.PageKhamPhaAdapter;
import com.google.android.material.tabs.TabLayout;


public class KhamPhaFragment extends AppCompatActivity {
    ImageView back;
    RadioButton rbOdau, rbAnGi;
    RadioGroup groupOdauAngi;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_kham_pha);
        TabLayout tabLayout = findViewById(R.id.tab_saved);
        final ViewPager viewPager = findViewById(R.id.view_pager_saved);
        PageKhamPhaAdapter pageKhamPhaAdapter = new PageKhamPhaAdapter(getSupportFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(pageKhamPhaAdapter);
        viewPager.setCurrentItem(viewPager.getCurrentItem());
        tabLayout.setupWithViewPager(viewPager);
        rbOdau = (RadioButton) findViewById(R.id.rb_odau);
        rbAnGi = (RadioButton) findViewById(R.id.rb_angi);
        groupOdauAngi = (RadioGroup) findViewById(R.id.group_odau_angi);
        back = (ImageView) findViewById(R.id.btt_back);
        back.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        KhamPhaFragment.this.onBackPressed();
            }
        });

        rbAnGi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(KhamPhaFragment.this, AnGiActivity.class);
                startActivity(i);
            }
        });
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
    }
}