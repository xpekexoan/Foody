package com.example.foody.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.foody.R;
import com.example.foody.model.NoiBat_Datcho_Model;
import com.squareup.picasso.Picasso;

import java.util.List;

public class Noibat_Datcho_Adapter extends BaseAdapter {
    private Context context;
    private  int layout;
    private List<NoiBat_Datcho_Model> noibatList;

    public List<NoiBat_Datcho_Model> getnoibatList() {
        return noibatList;
    }

    public void setnoibatList(List<NoiBat_Datcho_Model> noibatList) {
        this.noibatList = noibatList;
    }

    public Noibat_Datcho_Adapter() {
    }

    public Noibat_Datcho_Adapter(Context context, int layout, List<NoiBat_Datcho_Model> noibatList) {
        this.context = context;
        this.layout = layout;
        this.noibatList = noibatList;
    }

    @Override
    public int getCount() {
        return noibatList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View rowView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        rowView = inflater.inflate(layout,null);
        ImageView anh = rowView.findViewById(R.id.anh_noibat_datcho);
        ImageView anhchamdo = rowView.findViewById(R.id.chamdo_noibat_datcho);
        TextView tieude = rowView.findViewById(R.id.chude_noibat_datcho);
        TextView diachi = rowView.findViewById(R.id.diachi_noibat_datcho);
        TextView kc = rowView.findViewById(R.id.khoangcach_noibat_datcho);
        TextView thtin = rowView.findViewById(R.id.thongtin_noibat_datcho);
        TextView ngay = rowView.findViewById(R.id.thoigian_noibat_datcho);
        TextView giamgia = rowView.findViewById(R.id.giam_noibat_datcho);
        NoiBat_Datcho_Model noiBatDatchoModel = noibatList.get(position);
        Picasso.get().load(noibatList.get(position).getAnh()).into(anh);
        anhchamdo.setImageResource(noiBatDatchoModel.getAnhchamtron());
        tieude.setText(noiBatDatchoModel.getTieude());
        diachi.setText(noiBatDatchoModel.getDiachi());
        kc.setText(noiBatDatchoModel.getKhoangcach());
        thtin.setText(noiBatDatchoModel.getThongtin());
        ngay.setText(noiBatDatchoModel.getCangay());
        giamgia.setText(noiBatDatchoModel.getGiam());
        return rowView;
    }

}
