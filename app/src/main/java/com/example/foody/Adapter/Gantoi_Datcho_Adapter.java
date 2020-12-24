package com.example.foody.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.foody.R;
import com.example.foody.model.Gantoi_Datcho_Model;
import com.example.foody.view.Gantoi_Datcho_Home;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class Gantoi_Datcho_Adapter extends BaseAdapter {
    private Context context;
    private  int layout;
    private List<Gantoi_Datcho_Model> gantoiList;

    public List<Gantoi_Datcho_Model> getgantoiList() {
        return gantoiList;
    }

    public void setgantoiList(List<Gantoi_Datcho_Model> gantoiList) {
        this.gantoiList = gantoiList;
    }

    public Gantoi_Datcho_Adapter(Context context, int layout, List<Gantoi_Datcho_Model> gantoiList) {
        this.context = context;
        this.layout = layout;
        this.gantoiList = gantoiList;
    }

    @Override
    public int getCount() {
        return gantoiList.size();
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
        ImageView anh = rowView.findViewById(R.id.anh_gantoi_datcho);
        ImageView anhchamdo = rowView.findViewById(R.id.chamdo_gantoi_datcho);
        TextView tieude = rowView.findViewById(R.id.chude_gantoi_datcho);
        TextView diachi = rowView.findViewById(R.id.diachi_gantoi_datcho);
        TextView kc = rowView.findViewById(R.id.khoangcach_gantoi_datcho);
        TextView thtin = rowView.findViewById(R.id.thongtin_gantoi_datcho);
        TextView ngay = rowView.findViewById(R.id.thoigian_gantoi_datcho);
        TextView giamgia = rowView.findViewById(R.id.giam_gantoi_datcho);
        Gantoi_Datcho_Model gantoiDatchoModel = gantoiList.get(position);
        Picasso.get().load(gantoiList.get(position).getAnh()).into(anh);
        anhchamdo.setImageResource(gantoiDatchoModel.getImagechamtron());
        tieude.setText(gantoiDatchoModel.getTieude());
        diachi.setText(gantoiDatchoModel.getDiachi());
        kc.setText(gantoiDatchoModel.getKhoangcach());
        thtin.setText(gantoiDatchoModel.getThongtin());
        ngay.setText(gantoiDatchoModel.getCangay());
        giamgia.setText(gantoiDatchoModel.getGiam());
        return rowView;
    }

}
