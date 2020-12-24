package com.example.foody.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.foody.view.Datnhieu_Datcho_Home;
import com.example.foody.view.Gantoi_Datcho_Home;
import com.example.foody.view.Item1SavedFragment;
import com.example.foody.view.Item2Fragment;
import com.example.foody.view.Item3SavedFragment;
import com.example.foody.view.Item4SavedFragment;
import com.example.foody.view.Moi_Datcho_Home;
import com.example.foody.view.NoiBat_Datcho_Home;

public class PageCollectionAdapter extends FragmentStatePagerAdapter {
    private int numOfTabs;
    String title[] = {"Gần tôi", "Bán chạy", "Đánh giá", "Giao nhanh"};

    public PageCollectionAdapter(@NonNull FragmentManager fm, int numOfTabs) {
        super(fm);
        this.numOfTabs = numOfTabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new Datnhieu_Datcho_Home();
            case 1:
                return new NoiBat_Datcho_Home();
            case 2:
                return new Moi_Datcho_Home();
            case 3:
                return new Gantoi_Datcho_Home();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numOfTabs;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return title[position];
    }
}
