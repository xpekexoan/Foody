package com.example.foody.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.foody.R;
import com.example.foody.model.Product;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class ProductAdapter extends BaseAdapter {
    Context context;
    int layout;
    ArrayList<Product> ProductArray;

    public ProductAdapter(Context context, int layout, ArrayList<Product> productArray) {
        this.context = context;
        this.layout = layout;
        ProductArray = productArray;
    }

    @Override
    public int getCount() {
        return ProductArray.size();
    }

    @Override
    public Object getItem(int position) {
        return ProductArray.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }
    private class ViewHolder {
        TextView title;
        TextView detail;
        ImageView image_product;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        viewHolder = new ViewHolder();
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(layout,null);
        viewHolder.title = (TextView) convertView.findViewById(R.id.tv_item_moiday);
        viewHolder.detail = (TextView) convertView.findViewById(R.id.tv_item_moiday_detail);
        viewHolder.image_product = (ImageView)convertView.findViewById(R.id.img_item_moiday);
        Product product = ProductArray.get(position);
        viewHolder.title.setText(product.getTitle());
        viewHolder.detail.setText(product.getDetail());
        Picasso.get().load(ProductArray.get(position).getImage_product()).into(viewHolder.image_product);
        return convertView;
    }
}
