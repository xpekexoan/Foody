package com.example.foody.view;

import android.graphics.PorterDuff;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.foody.adapter.PageSavedItem2Adapter;
import com.example.foody.DAO.ThucAnDAO;
import com.example.foody.R;
import com.example.foody.adapter.ThucAnAdapter;
import com.google.android.material.tabs.TabLayout;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Item2Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Item2Fragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Item2Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Item2Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static Item2Fragment newInstance(String param1, String param2) {
        Item2Fragment fragment = new Item2Fragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    ListView lvSavedAll;
    ThucAnAdapter thucAnAdapter;
    ThucAnDAO thucAnDAO;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if(thucAnDAO==null)
        {
            thucAnDAO = new ThucAnDAO();
        }
        View v = inflater.inflate(R.layout.fragment_item2_saved_saved, container, false);
        final TabLayout tabLayout = v.findViewById(R.id.tab_saved_it2);
        final ViewPager viewPager = v.findViewById(R.id.view_pager_saved_it2);
        lvSavedAll = v.findViewById(R.id.lvSavedItem2);
        thucAnAdapter = new ThucAnAdapter(v.getContext(),R.layout.activity_dong_thuc_an,thucAnDAO.findAll());
        lvSavedAll.setAdapter(thucAnAdapter);

        tabLayout.getTabAt(0).getIcon().setColorFilter(getResources().getColor(R.color.colorRedLight), PorterDuff.Mode.SRC_IN);
        tabLayout.getTabAt(1).getIcon().setColorFilter(getResources().getColor(R.color.colorGray), PorterDuff.Mode.SRC_IN);
        tabLayout.getTabAt(2).getIcon().setColorFilter(getResources().getColor(R.color.colorGray), PorterDuff.Mode.SRC_IN);

        PageSavedItem2Adapter pageSavedAdapter = new PageSavedItem2Adapter(getChildFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(pageSavedAdapter);
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                switch (tab.getPosition())
                {
                    case 0:
                        tabLayout.getTabAt(0).getIcon().setColorFilter(getResources().getColor(R.color.colorRedLight), PorterDuff.Mode.SRC_IN);
                        thucAnAdapter.setThucAnList(thucAnDAO.findSaved());
                        lvSavedAll.setAdapter(thucAnAdapter);
                        break;
                    case 1:
                        tabLayout.getTabAt(1).getIcon().setColorFilter(getResources().getColor(R.color.colorRedLight), PorterDuff.Mode.SRC_IN);
                        thucAnAdapter.setThucAnList(thucAnDAO.findPlace());
                        lvSavedAll.setAdapter(thucAnAdapter);
                        break;
                    case 2:
                        tabLayout.getTabAt(2).getIcon().setColorFilter(getResources().getColor(R.color.colorRedLight), PorterDuff.Mode.SRC_IN);
                        thucAnAdapter.setThucAnList(thucAnDAO.findPlace());
                        lvSavedAll.setAdapter(thucAnAdapter);
                        break;
                }



            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                tabLayout.getTabAt(0).getIcon().setColorFilter(getResources().getColor(R.color.colorGray), PorterDuff.Mode.SRC_IN);
                tabLayout.getTabAt(1).getIcon().setColorFilter(getResources().getColor(R.color.colorGray), PorterDuff.Mode.SRC_IN);
                tabLayout.getTabAt(2).getIcon().setColorFilter(getResources().getColor(R.color.colorGray), PorterDuff.Mode.SRC_IN);

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        return v;
    }
}