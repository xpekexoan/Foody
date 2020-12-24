package com.example.foody.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.foody.R;
import com.example.foody.model.KhamPha;

import java.util.List;

public class KhamPhaAdapter extends BaseAdapter {
    private Context context;
    private  int layout;
    private List<KhamPha> khamPhaList;

    public List<KhamPha> getKhamPhaList() {
        return khamPhaList;
    }

    public void setKhamPhaList(List<KhamPha> khamPhaList) {
        this.khamPhaList = khamPhaList;
    }

    public KhamPhaAdapter(Context context, int layout, List<KhamPha> khamPhaList) {
        this.context = context;
        this.layout = layout;
        this.khamPhaList = khamPhaList;
    }

    @Override
    public int getCount() {
        return khamPhaList.size();
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
        KhamPha khamPha = khamPhaList.get(position);
        ten.setText(khamPha.getTen());
        diaChi.setText(khamPha.getDiaChi());
        thoiGian.setText(khamPha.getThoiGian());
        moTa.setText(khamPha.getMieuTa());
        im.setImageResource(khamPha.getAnh());
        return convertView;
    }
}
