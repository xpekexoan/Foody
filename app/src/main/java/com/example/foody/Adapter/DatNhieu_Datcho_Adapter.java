package com.example.foody.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.foody.R;
import com.example.foody.model.DatNhieu_Datcho_Model;
import com.example.foody.model.NoiBat_Datcho_Model;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class DatNhieu_Datcho_Adapter extends BaseAdapter  {
    private Context context;
    private  int layout;
    private List<DatNhieu_Datcho_Model> datnhieuList;


    public List<DatNhieu_Datcho_Model> getdatnhieuList() {
        return datnhieuList;
    }

    public void setdatnhieuList(List<DatNhieu_Datcho_Model> datnhieuList) {
        this.datnhieuList = datnhieuList;
    }

    public DatNhieu_Datcho_Adapter() {
    }

    public DatNhieu_Datcho_Adapter(Context context, int layout, List<DatNhieu_Datcho_Model> datnhieuList) {
        this.context = context;
        this.layout = layout;
        this.datnhieuList = datnhieuList;
    }

    @Override
    public int getCount() {
        return datnhieuList.size();
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
        ImageView anh = rowView.findViewById(R.id.anh_datnhieu_datcho);
        ImageView anhchamdo = rowView.findViewById(R.id.chamdo_datnhieu_datcho);
        TextView tieude = rowView.findViewById(R.id.chude_datnhieu_datcho);
        TextView diachi = rowView.findViewById(R.id.diachi_datnhieu_datcho);
        TextView kc = rowView.findViewById(R.id.khoangcach_datnhieu_datcho);
        TextView thtin = rowView.findViewById(R.id.thongtin_datnhieu_datcho);
        TextView ngay = rowView.findViewById(R.id.thoigian_datnhieu_datcho);
        TextView giamgia = rowView.findViewById(R.id.giam_datnhieu_datcho);
        DatNhieu_Datcho_Model datNhieuDatchoModel = datnhieuList.get(position);

        Picasso.get().load(datnhieuList.get(position).getAnh()).into(anh);
        anhchamdo.setImageResource(datNhieuDatchoModel.getAnhchamtron());
        tieude.setText(datNhieuDatchoModel.getTieude());
        diachi.setText(datNhieuDatchoModel.getDiachi());
        kc.setText(datNhieuDatchoModel.getKhoangcach());
        thtin.setText(datNhieuDatchoModel.getThongtin());
        ngay.setText(datNhieuDatchoModel.getCangay());
        giamgia.setText(datNhieuDatchoModel.getGiam());
        return rowView;
    }

}
