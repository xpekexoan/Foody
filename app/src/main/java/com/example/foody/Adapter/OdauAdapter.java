package com.example.foody.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.foody.R;
import com.example.foody.model.Odau;

import java.util.List;

public class OdauAdapter extends BaseAdapter {
    private Context context;
    private  int layout;
    private List<Odau> odauList;

    public List<Odau> getOdauList() {
        return odauList;
    }

    public void setOdauList(List<Odau> odauList) {
        this.odauList = odauList;
    }

    public OdauAdapter(Context context, int layout, List<Odau> odauList) {
        this.context = context;
        this.layout = layout;
        this.odauList = odauList;
    }

    @Override
    public int getCount() {
        return odauList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(layout,null);
        TextView ten = convertView.findViewById(R.id.tvTen);
        TextView diaChi = convertView.findViewById(R.id.tvDiaChi);
        TextView thoiGian = convertView.findViewById(R.id.tvThoiGian);
        TextView moTa = convertView.findViewById(R.id.tvMoTa);
        ImageView im = convertView.findViewById(R.id.imAnh);
        Odau odau = odauList.get(position);
        ten.setText(odau.getTen());
        diaChi.setText(odau.getDiaChi());
        thoiGian.setText(odau.getThoiGian());
        moTa.setText(odau.getMieuTa());
        im.setImageResource(odau.getAnh());
        return convertView;
    }
}
