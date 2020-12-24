package com.example.foody.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.foody.R;
import com.example.foody.model.Moi_Datcho_Model;
import com.squareup.picasso.Picasso;

import java.util.List;

public class Moi_Datcho_Adapter extends BaseAdapter {
    private Context context;
    private  int layout;
    private List<Moi_Datcho_Model> moiList;

    public List<Moi_Datcho_Model> getmoiList() {
        return moiList;
    }

    public void setmoiList(List<Moi_Datcho_Model> moiList) {
        this.moiList = moiList;
    }

    public Moi_Datcho_Adapter(Context context, int layout, List<Moi_Datcho_Model> moiList) {
        this.context = context;
        this.layout = layout;
        this.moiList = moiList;
    }

    @Override
    public int getCount() {
        return moiList.size();
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
        ImageView anh = rowView.findViewById(R.id.anh_moi_datcho);
        ImageView anhchamdo = rowView.findViewById(R.id.chamdo_moi_datcho);
        TextView tieude = rowView.findViewById(R.id.chude_moi_datcho);
        TextView diachi = rowView.findViewById(R.id.diachi_moi_datcho);
        TextView kc = rowView.findViewById(R.id.khoangcach_moi_datcho);
        TextView thtin = rowView.findViewById(R.id.thongtin_moi_datcho);
        TextView ngay = rowView.findViewById(R.id.thoigian_moi_datcho);
        TextView giamgia = rowView.findViewById(R.id.giam_moi_datcho);
        Moi_Datcho_Model moiDatchoModel = moiList.get(position);
        Picasso.get().load(moiList.get(position).getAnh()).into(anh);
        anhchamdo.setImageResource(moiDatchoModel.getImagechamtron());
        tieude.setText(moiDatchoModel.getTieude());
        diachi.setText(moiDatchoModel.getDiachi());
        kc.setText(moiDatchoModel.getKhoangcach());
        thtin.setText(moiDatchoModel.getThongtin());
        ngay.setText(moiDatchoModel.getCangay());
        giamgia.setText(moiDatchoModel.getGiam());
        return rowView;
    }

}
