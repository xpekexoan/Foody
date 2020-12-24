package com.example.foody.view;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import com.example.foody.R;

public class Home_Login extends Fragment {
    TextView tv_moibanbe, tv_csach, tv_cdat, tv_hoadon, tv_gopy, tv_viVoucher;
    EditText etEmail, etPassword;
    TextView tv_thanhtoan, tv_tienthuong;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.activity_home__login, container, false);
        etEmail = (EditText) v.findViewById(R.id.etEmail);
        etPassword = (EditText) v.findViewById(R.id.etPassword);
        tv_moibanbe = (TextView) v.findViewById(R.id.moibanbe);
        tv_csach = (TextView) v.findViewById(R.id.chinhsach);
        tv_cdat = (TextView) v.findViewById(R.id.caidat);
        tv_thanhtoan = (TextView) v.findViewById(R.id.thanhtoan);
        tv_tienthuong = (TextView) v.findViewById(R.id.tienthuong);
        tv_hoadon = (TextView) v.findViewById(R.id.hoadon);
        tv_gopy = (TextView) v.findViewById(R.id.gop_y);
        tv_viVoucher = (TextView) v.findViewById(R.id.voucher);

        tv_thanhtoan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), PayActivity.class);
                startActivity(i);
            }
        });
        tv_tienthuong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), BonusMoneyActivity.class);
                startActivity(i);
            }
        });
        tv_viVoucher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), Login.class);
                startActivity(i);
            }
        });
        tv_moibanbe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), AddFriendActivity.class);
                startActivity(i);
            }
        });

        tv_csach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), PolicyActivity.class);
                startActivity(i);
            }
        });

        tv_cdat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), SettingActivity.class);
                startActivity(i);
            }
        });

        tv_hoadon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), BillActivity.class);
                startActivity(i);
            }
        });

        tv_gopy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), Login.class);
                startActivity(i);
            }
        });
        return v;
    }
    }