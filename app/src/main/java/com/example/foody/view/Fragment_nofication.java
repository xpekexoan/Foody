package com.example.foody.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.example.foody.R;
import com.example.foody.adapter.ViewPagerAdapter;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;

public class Fragment_nofication extends Fragment {
    private TabLayout tabLayout;
    private AppBarLayout appBarLayout;
    private ViewPager viewPager;
    View v;
    ImageView imageView, imageView1;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_nofication, container, false);
        tabLayout =  (TabLayout) v.findViewById(R.id.tablayout_id);
        appBarLayout = (AppBarLayout) v.findViewById(R.id.appbar_id);
        viewPager  = (ViewPager) v.findViewById(R.id.viewpager_id);
        ViewPagerAdapter adapter = new ViewPagerAdapter (getChildFragmentManager(),tabLayout.getTabCount());
        //add Fragments
        adapter.AddFragment(new Fragment_Service_Notification(),"Dịch vụ");
        adapter.AddFragment(new Fragment_Forme_Notification(),"Của tôi");
        adapter.AddFragment(new Fragment_News_Nofication(),"Tin mới");
        //add Setup
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
        imageView = (ImageView) v.findViewById(R.id.icon_setting);

        imageView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(),Setting_Nofication.class);
                startActivity(in);
            }
        });
        imageView1 = (ImageView) v.findViewById(R.id.icon_search);

        imageView1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(),Search_Nofication.class);
                startActivity(in);
            }
        });
        return v;
    }
}
