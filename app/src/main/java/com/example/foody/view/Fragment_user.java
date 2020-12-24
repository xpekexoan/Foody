package com.example.foody.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.foody.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Fragment_user extends Fragment {
    LinearLayout true_login,false_login;
    FirebaseUser user;
    FirebaseAuth mAuth;
    TextView tv_moibanbe,tv_csach,tv_cdat,tv_hoadon,tv_gopy,tv_user,tv_logOut;
    EditText etEmail, etPassword;
    TextView tv_thanhtoan,tv_tienthuong;
    TextView tv_dn;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.fragment_user,container,false);

        mAuth = FirebaseAuth.getInstance();
        true_login = v.findViewById(R.id.true_login);
        false_login = v.findViewById(R.id.false_login);
        tv_user = v.findViewById(R.id.tv_user);

        tv_dn = (TextView) v.findViewById(R.id.dangnhap);
        etEmail = (EditText) v.findViewById(R.id.etEmail);
        etPassword = (EditText) v.findViewById(R.id.etPassword);
        tv_moibanbe = (TextView) v.findViewById(R.id.moibanbe);
        tv_csach = (TextView) v.findViewById(R.id.chinhsach);
        tv_cdat = (TextView) v.findViewById(R.id.caidat);
        tv_thanhtoan = (TextView) v.findViewById(R.id.thanhtoan);
        tv_tienthuong = (TextView) v.findViewById(R.id.tienthuong);
        tv_hoadon = (TextView) v.findViewById(R.id.hoadon);
        tv_gopy = (TextView) v.findViewById(R.id.gop_y);

        checkLogin();

        tv_logOut = v.findViewById(R.id.dangxuat);
        tv_logOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                checkLogin();
            }
        });

        tv_dn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), Login.class);
                getActivity().startActivity(i);
            }
        });

        tv_moibanbe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent( getActivity(), AddFriendActivity.class);
                getActivity().startActivity(i);
            }
        });

        tv_csach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent( getActivity(), PolicyActivity.class);
                getActivity().startActivity(i);
            }
        });

        tv_cdat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent( getActivity(), SettingActivity.class);
                getActivity().startActivity(i);
            }
        });
        tv_thanhtoan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent( getActivity(), PayActivity.class);
                getActivity().startActivity(i);
            }
        });
        tv_hoadon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent( getActivity(), BillActivity.class);
                getActivity().startActivity(i);
            }
        });
        tv_tienthuong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent( getActivity(), BonusMoneyActivity.class);
                getActivity().startActivity(i);
            }
        });
        tv_gopy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent( getActivity(), Login.class);
                getActivity().startActivity(i);
            }
        });

        return v;
    }
    public void checkLogin() {
        user = mAuth.getCurrentUser();
        if(user!=null){
            false_login.setVisibility(View.GONE);
            true_login.setVisibility(View.VISIBLE);
            tv_user.setText(user.getDisplayName());
        }
        else {
            false_login.setVisibility(View.VISIBLE);
            true_login.setVisibility(View.GONE);
        }
    }
}
