package com.example.foody.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import com.example.foody.DAO.KhamPhaDAO;
import com.example.foody.R;
import com.example.foody.adapter.KhamPhaAdapter;

public class Item1KhamPhaFragment extends Fragment {

    ListView lvKhamPhaAll;
    KhamPhaAdapter khamPhaAdapter;
    KhamPhaDAO khamPhaDAO;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if(khamPhaDAO==null)
        {
            khamPhaDAO = new KhamPhaDAO();
        }
        View v = inflater.inflate(R.layout.fragment_item1_khampha, container, false);
        khamPhaAdapter = new com.example.foody.adapter.KhamPhaAdapter(v.getContext(), R.layout.activity_dong_kham_pha,khamPhaDAO.findAll());
        lvKhamPhaAll = v.findViewById(R.id.lvKhamPha);
        lvKhamPhaAll.setAdapter(khamPhaAdapter);


        return v;
    }
}