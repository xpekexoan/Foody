package com.example.foody.view;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.foody.R;

import java.util.List;

public class Place_Search_Nofication extends Fragment {
    ListView listView;
    String[] name = {"Mỳ cay","Tea-rex","Lẩu 1 người ","Tokbokki","Sữa tươi trân châu đường đen"};
    int[] img = {R.drawable.ic_baseline_close,R.drawable.ic_baseline_close,R.drawable.ic_baseline_close,R.drawable.ic_baseline_close,R.drawable.ic_baseline_close};
    public Place_Search_Nofication() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View view = inflater.inflate(R.layout.place_search_nofication,container,false);
        listView = (ListView) view.findViewById(R.id.List_place);
        listView.setAdapter(new Place_Adapter(getActivity(),R.layout.rowlist_place_search_nofication,name));
        return view;
    }
    class Place_Adapter extends ArrayAdapter{

        public Place_Adapter (Context context, int resource, String[] objects){
            super(context,resource,objects);
        }
        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            View view =((Activity)getContext()).getLayoutInflater().inflate(R.layout.rowlist_place_search_nofication,null);
            TextView txt1 = (TextView) view.findViewById(R.id.tv1_place);
            txt1.setText(name[position]);
            ImageView imgs = (ImageView) view.findViewById(R.id.anh_place);
            imgs.setBackgroundResource(img[position]);
            return view;
        }
    }
}
