package com.example.foody.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.foody.R;
import com.example.foody.model.RecentViewSearch_Notification_Model;

import java.util.List;

public class RecentViewSearch_Notification_Adapter extends BaseAdapter {
    private Context context;
    private  int layout;
    private List<RecentViewSearch_Notification_Model> recentviewList;

    public List<RecentViewSearch_Notification_Model> recentviewList() {
        return recentviewList;
    }

    public void setrecentviewList(List<RecentViewSearch_Notification_Model> recentviewList) {
        this.recentviewList = recentviewList;
    }

    public RecentViewSearch_Notification_Adapter(Context context, int layout, List<RecentViewSearch_Notification_Model> recentviewList) {
        this.context = context;
        this.layout = layout;
        this.recentviewList = recentviewList;
    }

    @Override
    public int getCount() {
        return recentviewList.size();
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
        ImageView anh = rowView.findViewById(R.id.anh_recentview);
        TextView tieude1 = rowView.findViewById(R.id.tv1_recentview);
        TextView tieude2 = rowView.findViewById(R.id.tv2_recentview);
        TextView tieude3 = rowView.findViewById(R.id.tv3_recentview);
        TextView tieude4 = rowView.findViewById(R.id.tv4_recentview);
        TextView tieude5 = rowView.findViewById(R.id.tv5_recentview);
        TextView tieude6 = rowView.findViewById(R.id.tv6_recentview);
        RecentViewSearch_Notification_Model recentViewSearchNotificationModel = recentviewList.get(position);
        anh.setImageResource(recentViewSearchNotificationModel.getImage());
        tieude1.setText(recentViewSearchNotificationModel.getTieude1());
        tieude2.setText(recentViewSearchNotificationModel.getTieude2());
        tieude3.setText(recentViewSearchNotificationModel.getTieude3());
        tieude4.setText(recentViewSearchNotificationModel.getTieude4());
        tieude5.setText(recentViewSearchNotificationModel.getTieude5());
        tieude6.setText(recentViewSearchNotificationModel.getTieude6());
        return rowView;
    }
}
