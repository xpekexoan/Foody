package com.example.foody.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.foody.view.Item2FileSavedFragment;
import com.example.foody.view.Item2SavedSavedFragment;

public class PageSavedItem2Adapter extends FragmentStatePagerAdapter {
    private int numOfTabs;
    public PageSavedItem2Adapter(@NonNull FragmentManager fm, int numOfTabs) {
        super(fm);
        this.numOfTabs=numOfTabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                return new Item2SavedSavedFragment.Item2MapFragment();
            case 1:
                return new Item2FileSavedFragment();
            case 2:
                return new Item2SavedSavedFragment();
                default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return numOfTabs;
    }

}
