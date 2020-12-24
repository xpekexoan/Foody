package com.example.foody.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.foody.R;
import com.example.foody.adapter.Moi_Datcho_Adapter;
import com.example.foody.model.Moi_Datcho_Model;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Moi_Datcho_Home#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Moi_Datcho_Home extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Moi_Datcho_Home() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Item1Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static Moi_Datcho_Home newInstance(String param1, String param2) {
        Moi_Datcho_Home fragment = new Moi_Datcho_Home();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }
    private DatabaseReference mDatabase;
    ListView lvSavedAll;
    Moi_Datcho_Adapter moi_datcho_adapter;
    ArrayList<Moi_Datcho_Model> moi_datcho_modelArrayList;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_moi_datcho_home, container, false);
        mDatabase = FirebaseDatabase.getInstance().getReference();

//        Moi_Datcho_Model datNhieu_datcho_model = new Moi_Datcho_Model("https://firebasestorage.googleapis.com/v0/b/foody-fcadf.appspot.com/o/Image%2FHome%2FDatCho%2Fhotpot_datcho.jpg?alt=media&token=ac4ecf7d-7520-4237-a6f9-cbfbfe9a3c0f", R.drawable.ic_chamdotron,"Mama Hot Pot - Yên Bái","89 Yên Bái, Quận Hải Châu, Đà Nẵng",">2.2km","Nhà hàng/Gia đình/Nhóm hội","Cả ngày","Giảm 15%");
//        Moi_Datcho_Model datNhieu_datcho_model1 = new Moi_Datcho_Model("https://firebasestorage.googleapis.com/v0/b/foody-fcadf.appspot.com/o/Image%2FHome%2FDatCho%2Famthucthai_datcho.jpg?alt=media&token=8684e20b-6b11-4a79-8e7e-7dc9131ee4db",R.drawable.ic_chamdotron,"My Thái Restaurant - Ẩm Thực Thái","389 Trần Hưng Đạo,Q. Sơn Trà, Đà....",">4.4km","Nhà hàng/Gia đình/Nhóm hội","Cả ngày","Giảm 25%");
//        Moi_Datcho_Model datNhieu_datcho_model2 = new Moi_Datcho_Model("https://firebasestorage.googleapis.com/v0/b/foody-fcadf.appspot.com/o/Image%2FHome%2FDatCho%2Fdanabuffet_datcho.jpg?alt=media&token=8c2a599b-db81-440f-8c29-76e5070db44b", R.drawable.ic_chamdotron,"Dana Buffet","56 Nguyễn Chí Thanh, Quận Hải Châu",">1.1km","Buffet/buffet","Cả ngày","Giảm 20% - 40%");
//        Moi_Datcho_Model datNhieu_datcho_model3 = new Moi_Datcho_Model("https://firebasestorage.googleapis.com/v0/b/foody-fcadf.appspot.com/o/Image%2FHome%2FDatCho%2Fdaynday_datcho.jpg?alt=media&token=577163ae-d3ad-4842-a346-e93168124235",R.drawable.ic_chamdotron,"Đầy N Day - Pizza & Hamburger","03 Hoàng Văn Thụ, Quận Hải Châu, ĐN",">2.4km","Nhà hàng/Gia đình/Nhóm hội","Cả ngày","Giảm 20%");
//        Moi_Datcho_Model datNhieu_datcho_model4 = new Moi_Datcho_Model("https://firebasestorage.googleapis.com/v0/b/foody-fcadf.appspot.com/o/Image%2FHome%2FDatCho%2Fdasushi_datcho.jpg?alt=media&token=cd2478bc-50a7-4f41-835d-85c54c828ac2",R.drawable.ic_chamdotron,"Dasushi - Ăn Nhậu Kiểu Nhật","266 Nguyễn Văn Linh, Quận Thanh....",">3.2km","Nhà hàng/Gia đình/Nhóm hội","Cả ngày","Giảm 10%");
//        Moi_Datcho_Model datNhieu_datcho_model5 = new Moi_Datcho_Model("https://firebasestorage.googleapis.com/v0/b/foody-fcadf.appspot.com/o/Image%2FHome%2FDatCho%2Fphonuongtokyo_datcho.jpg?alt=media&token=ab688be1-a413-4860-a871-f2a0b4c125da",R.drawable.ic_chamdotron,"Phố Nướng Tokyo","4 Phạm Văn Đồng, Quận Sơn Trà, ĐN",">2.8km","Nhà hàng/Gia đình/Nhóm hội","Cả ngày","Giảm 5%");
//        Moi_Datcho_Model datNhieu_datcho_model6 = new Moi_Datcho_Model("https://firebasestorage.googleapis.com/v0/b/foody-fcadf.appspot.com/o/Image%2FHome%2FDatCho%2Fcoffeepub_datcho.jpg?alt=media&token=ceede65e-f5b0-4551-b51a-b314bf523c80",R.drawable.ic_chamdotron,"420 Coffee And Pub","K3/12 Phan Thành Tài, Q.Hải Châu,Đ..",">3.4km","Bar/Pub/Gia đình/Nhóm hội","Cả ngày","Giảm 10%");
//        Moi_Datcho_Model datNhieu_datcho_model7 = new Moi_Datcho_Model("https://firebasestorage.googleapis.com/v0/b/foody-fcadf.appspot.com/o/Image%2FHome%2FDatCho%2Fwinecorner_datcho.jpg?alt=media&token=7b7fbd4f-2c9a-4ec8-974f-a87c52ea9314",R.drawable.ic_chamdotron,"Wine Corner","124 Đường 2/9, Quận Hải Châu,Đà Nẵng",">3.3km","Bar/Pub/Gia đình/Nhóm hội","Cả ngày","Giảm 25%") ;
//        Moi_Datcho_Model datNhieu_datcho_model8 = new Moi_Datcho_Model("https://firebasestorage.googleapis.com/v0/b/foody-fcadf.appspot.com/o/Image%2FHome%2FDatCho%2Fnhahang1988_datcho.jpg?alt=media&token=3fb2a071-cccf-4ce0-b171-b4524466abdb",R.drawable.ic_chamdotron,"Nhà hàng 1988","195 - 197 Châu Thị Vĩnh Tế, Q.Ngũ...",">4.7km","Nhà hàng/Gia đình/Nhóm hội","Cả ngày","Đặt Chỗ");
//        Moi_Datcho_Model datNhieu_datcho_model9 = new Moi_Datcho_Model ("https://firebasestorage.googleapis.com/v0/b/foody-fcadf.appspot.com/o/Image%2FHome%2FDatCho%2Fthucan1.jpg?alt=media&token=7a415c71-7173-4aeb-aa0d-75d370cbb51b",R.drawable.ic_chamdotron,"Dana Bay Seafood","10 Võ Văn Kiệt, Q. Sơn Trà, Đà Nẵng",">3.3km","Buffet/buffet","Cả ngày","Giảm 5%");
//
//        mDatabase.child("Foody").child("Moi").push().setValue(datNhieu_datcho_model);
//        mDatabase.child("Foody").child("Moi").push().setValue(datNhieu_datcho_model1);
//        mDatabase.child("Foody").child("Moi").push().setValue(datNhieu_datcho_model2);
//        mDatabase.child("Foody").child("Moi").push().setValue(datNhieu_datcho_model3);
//        mDatabase.child("Foody").child("Moi").push().setValue(datNhieu_datcho_model4);
//        mDatabase.child("Foody").child("Moi").push().setValue(datNhieu_datcho_model5);
//        mDatabase.child("Foody").child("Moi").push().setValue(datNhieu_datcho_model6);
//        mDatabase.child("Foody").child("Moi").push().setValue(datNhieu_datcho_model7);
//        mDatabase.child("Foody").child("Moi").push().setValue(datNhieu_datcho_model8);
//        mDatabase.child("Foody").child("Moi").push().setValue(datNhieu_datcho_model9);

        lvSavedAll = v.findViewById(R.id.listView_moi_datcho);
        moi_datcho_modelArrayList = new ArrayList<>();
        Query query = mDatabase.child("Foody").child("Moi");
        query.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {
                Moi_Datcho_Model moi_datcho_model = snapshot.getValue(Moi_Datcho_Model.class);
                moi_datcho_modelArrayList.add(moi_datcho_model);
                moi_datcho_adapter = new Moi_Datcho_Adapter(getContext(),R.layout.rowlist_moi_datcho_home,moi_datcho_modelArrayList);
                lvSavedAll.setAdapter(moi_datcho_adapter);
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

        return v;
    }
}