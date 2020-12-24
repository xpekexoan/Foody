package com.example.foody.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.foody.R;
import com.example.foody.model.News_Nofication_Model;
import com.squareup.picasso.Picasso;

import java.util.List;

public class News_Notification_Adapter extends BaseAdapter {
    private Context context;
    private  int layout;
    private List<News_Nofication_Model> newsList;

    public List<News_Nofication_Model> newsList() {
        return newsList;
    }

    public void setnewsList(List<News_Nofication_Model> newsList) {
        this.newsList = newsList;
    }

    public News_Notification_Adapter(Context context, int layout, List<News_Nofication_Model> newsList) {
        this.context = context;
        this.layout = layout;
        this.newsList = newsList;
    }

    @Override
    public int getCount() {
        return newsList.size();
    }

    @Override
    public Object getItem(int i) {
        return newsList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View rowView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        rowView = inflater.inflate(layout,null);
        ImageView anh = rowView.findViewById(R.id.anh_tintuc_thongbao);
        TextView tieude1 = rowView.findViewById(R.id.tv1_tintuc_thongbao);
        TextView tieude2 = rowView.findViewById(R.id.tv2_tintuc_thongbao);
        TextView tieude3 = rowView.findViewById(R.id.tv3_tintuc_thongbao);

        News_Nofication_Model newsNoficationModel = newsList.get(position);
        anh.setImageResource(newsNoficationModel.getAnh());
        tieude1.setText(newsNoficationModel.getTieude1());
        tieude2.setText(newsNoficationModel.getTieude2());
        tieude3.setText(newsNoficationModel.getTieude3());
        return rowView;
    }
}
