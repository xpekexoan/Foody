package com.example.foody.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;

import com.example.foody.DAO.Notification_DAO;
import com.example.foody.R;
import com.example.foody.adapter.RecentViewSearch_Notification_Adapter;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Recentview_Search_Nofication#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Recentview_Search_Nofication extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Recentview_Search_Nofication() {
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
    public static Recentview_Search_Nofication newInstance(String param1, String param2) {
        Recentview_Search_Nofication fragment = new Recentview_Search_Nofication();
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
    ListView lvSavedAll;
    RecentViewSearch_Notification_Adapter thucAnAdapter;
    Notification_DAO thucAnDAO;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if(thucAnDAO==null)
        {
            thucAnDAO = new Notification_DAO();
        }
        View v = inflater.inflate(R.layout.recentview_search_nofication, container, false);
        thucAnAdapter = new com.example.foody.adapter.RecentViewSearch_Notification_Adapter(v.getContext(), R.layout.rowlist_recentview_nofication,thucAnDAO.RecentViewList());
        lvSavedAll = v.findViewById(R.id.List_recentview_notification);
        lvSavedAll.setAdapter(thucAnAdapter);

        lvSavedAll.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                System.out.println(thucAnDAO.RecentViewList().get(position).getImage());
                AlertDialog.Builder b = new AlertDialog.Builder(getActivity());
                b.setTitle("Xác nhận");
                b.setMessage("Bạn có đồng ý thoát chương trình không?");
                AlertDialog al = b.create();
                al.show();
            }
        });
        return v;
    }
}