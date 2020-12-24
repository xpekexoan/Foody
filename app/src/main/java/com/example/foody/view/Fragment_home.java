package com.example.foody.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.example.foody.R;

import com.example.foody.adapter.ImageAdapter;
import com.example.foody.adapter.ProductAdapter;
import com.example.foody.model.Product;
import com.example.foody.view.Grid_Item_MoiDay;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class Fragment_home extends Fragment {
    ImageView khamPha;
    GridView gridView;
    ArrayList<Product> arrayListProduct;
    ProductAdapter productAdapter;
    private DatabaseReference mDatabase;

    View v;
    @Nullable
    @Override
    public View onCreateView(@NonNull final LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_home, container, false);

        ViewPager viewPager = v.findViewById(R.id.view_pager);
        ImageAdapter adapter = new ImageAdapter(getContext());
        viewPager.setAdapter(adapter);

        khamPha = v.findViewById(R.id.khampha);

        ImageView img_delivery = v.findViewById(R.id.img_delivery);
        img_delivery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Home_Collection.class);
                startActivity(intent);
            }
        });
        ImageView img_datcho = v.findViewById(R.id.datcho);
        img_datcho.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Home_Datcho_Activity.class);
                startActivity(intent);
            }
        });
        khamPha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), KhamPhaFragment.class);
                getActivity().startActivity(i);
            }
        });

//        mDatabase = FirebaseDatabase.getInstance().getReference();
//        Product product = new Product("Cơm văn phòng","Quán bán online thôi, phần cơm 30k khá là đầy đặn luôn","https://firebasestorage.googleapis.com/v0/b/foody-fcadf.appspot.com/o/Image%2FProduct%2Fcomvanphong.jpg?alt=media&token=7553ffeb-b681-46ba-baaf-de67c860a182");
//        Product product1 = new Product("Nhà hàng lẩu","Nhà hàng lẩu & nướng là có những món ngon tuyệt vời","https://firebasestorage.googleapis.com/v0/b/foody-fcadf.appspot.com/o/Image%2FProduct%2Fnhahanglau.jpg?alt=media&token=a16a2d38-eadc-414c-8275-bee7f57b2d99");
//        Product product2 = new Product("Sala Foody","Không khí quá vui có phòng riêng nên chúng mình có thể vừa thưởng thức vừa hát hò"
//                ,"https://firebasestorage.googleapis.com/v0/b/foody-fcadf.appspot.com/o/Image%2FProduct%2Fbuffetnuong.jpg?alt=media&token=79a1c572-9870-446d-ace1-fa0da7df6a40");
//        Product product3 = new Product("Lẩu Thái Lan","Cơm ở đây khá được phần 30k khá rẻ","https://firebasestorage.googleapis.com/v0/b/foody-fcadf.appspot.com/o/Image%2FProduct%2Flauthai.jpg?alt=media&token=0a70ea47-db00-4897-9848-c5c50f0a8a7c");
//
//        mDatabase.child("Foody").child("Product1").push().setValue(product3);
//        mDatabase.child("Foody").child("Product1").push().setValue(product2);
//        mDatabase.child("Foody").child("Product1").push().setValue(product);
//        mDatabase.child("Foody").child("Product1").push().setValue(product1);
        LoadData();
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getActivity(),Grid_Item_MoiDay.class);
                intent.putExtra("Product", arrayListProduct.get(position));
                startActivity(intent);
            }
        });
        final TextView tvMoiDay =v.findViewById(R.id.tvMoiday);
        final TextView tvGanToi=v.findViewById(R.id.tvGantoi);
        tvMoiDay.setTextColor(getResources().getColor(R.color.colorBlack));
        tvMoiDay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMoiDay.setTextColor(getResources().getColor(R.color.colorBlack));
                tvGanToi.setTextColor(getResources().getColor(R.color.colorGray));
                LoadData();
            }
        });

        tvGanToi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvGanToi.setTextColor(getResources().getColor(R.color.colorBlack));
                tvMoiDay.setTextColor(getResources().getColor(R.color.colorGray));
                LoadData1();
            }
        });
        return v;
    }
    public void LoadData() {
        mDatabase = FirebaseDatabase.getInstance().getReference();
        gridView = v.findViewById(R.id.gridview_moiday);
        arrayListProduct = new ArrayList<>();
        Query query =  mDatabase.child("Foody").child("Product");
        query.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {
                Product product = snapshot.getValue(Product.class);
                arrayListProduct.add(product);
                productAdapter = new ProductAdapter(getContext(),R.layout.row_data_moiday,arrayListProduct);
                gridView.setAdapter(productAdapter);
            }

            @Override
            public void onChildChanged(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {

            }

            @Override
            public void onChildRemoved(@NonNull DataSnapshot snapshot) {

            }

            @Override
            public void onChildMoved(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }

    public void LoadData1() {
        mDatabase = FirebaseDatabase.getInstance().getReference();
        gridView = v.findViewById(R.id.gridview_moiday);
        arrayListProduct = new ArrayList<>();
        Query query =  mDatabase.child("Foody").child("Product1");
        query.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {
                Product product = snapshot.getValue(Product.class);
                arrayListProduct.add(product);
                productAdapter = new ProductAdapter(getContext(),R.layout.row_data_moiday,arrayListProduct);
                gridView.setAdapter(productAdapter);
            }

            @Override
            public void onChildChanged(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {

            }

            @Override
            public void onChildRemoved(@NonNull DataSnapshot snapshot) {

            }

            @Override
            public void onChildMoved(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }

}