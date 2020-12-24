package com.example.foody.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.foody.R;
import com.example.foody.model.ThucAn;

import java.util.List;

public class ThucAnAdapter extends BaseAdapter {
    private Context context;
    private  int layout;
    private List<ThucAn> thucAnList;

    public List<ThucAn> getthucAnList() {
        return thucAnList;
    }

    public void setThucAnList(List<ThucAn> thucAnList) {
        this.thucAnList = thucAnList;
    }

    public ThucAnAdapter(Context context, int layout, List<ThucAn> thucAnList) {
        this.context = context;
        this.layout = layout;
        this.thucAnList = thucAnList;
    }

    @Override
    public int getCount() {
        return thucAnList.size();
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
        ThucAn thucAn = thucAnList.get(position);
        ten.setText(thucAn.getTen());
        diaChi.setText(thucAn.getDiaChi());
        thoiGian.setText(thucAn.getThoiGian());
        moTa.setText(thucAn.getMieuTa());
        im.setImageResource(thucAn.getAnh());
        return convertView;
    }
}
