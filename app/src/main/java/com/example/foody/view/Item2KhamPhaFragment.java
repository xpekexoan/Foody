package com.example.foody.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import com.example.foody.DAO.OdauDAO;
import com.example.foody.R;
import com.example.foody.adapter.OdauAdapter;


public class Item2KhamPhaFragment extends Fragment {

    ListView lvOdauAll;
    OdauAdapter odauAdapter;
    OdauDAO odauDAO;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if(odauDAO==null)
        {
            odauDAO = new OdauDAO();
        }
        View v = inflater.inflate(R.layout.fragment_item2_khampha, container, false);
        odauAdapter = new com.example.foody.adapter.OdauAdapter(v.getContext(), R.layout.activity_dong_kham_pha,odauDAO.findAll());
        lvOdauAll = v.findViewById(R.id.lvKhamPhaItem2);
        lvOdauAll.setAdapter(odauAdapter);


        return v;
    }
}