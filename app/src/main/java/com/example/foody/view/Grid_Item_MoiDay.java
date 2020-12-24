package com.example.foody.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.foody.R;
import com.example.foody.model.Product;
import com.squareup.picasso.Picasso;

public class Grid_Item_MoiDay extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid__item__moi_day);
        Product product = (Product) getIntent().getSerializableExtra("Product");
        TextView title = findViewById(R.id.tv_griditem_moiday1);
        title.setText(product.getTitle());
        TextView title1 = findViewById(R.id.tv_griditem_moiday);
        title1.setText(product.getTitle());
        ImageView img = findViewById(R.id.img_griditem_moiday);
        Picasso.get().load(product.getImage_product()).into(img);
    }
}