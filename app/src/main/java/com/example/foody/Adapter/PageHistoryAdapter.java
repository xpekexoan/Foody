package com.example.foody.adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.foody.view.Item1SavedFragment;
import com.example.foody.view.Item2Fragment;
import com.example.foody.view.Item3SavedFragment;
import com.example.foody.view.Item4SavedFragment;

public class PageHistoryAdapter extends FragmentStatePagerAdapter {
    private int numOfTabs;
    String title[]={"Tất cả","Địa điểm","Ảnh"};
    public PageHistoryAdapter(@NonNull FragmentManager fm, int numOfTabs) {
        super(fm);
        this.numOfTabs=numOfTabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                return new Item1SavedFragment();
            case 1:
                return new Item2Fragment();
            case 2:
                return new Item3SavedFragment();
                default:
                return null;
        }

    }

    @Override
    public int getItemPosition(@NonNull Object object) {
        return POSITION_NONE;
    }

    @Override
    public int getCount() {
        return numOfTabs;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return title[position];
    }
}
