package com.example.foody.view;

import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import com.example.foody.adapter.ThucAnAdapter;
import com.example.foody.DAO.ThucAnDAO;
import com.example.foody.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Item1SavedFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Item1SavedFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Item1SavedFragment() {
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
    public static Item1SavedFragment newInstance(String param1, String param2) {
        Item1SavedFragment fragment = new Item1SavedFragment();
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
    ThucAnAdapter thucAnAdapter;
    ThucAnDAO thucAnDAO;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if(thucAnDAO==null)
        {
            thucAnDAO = new ThucAnDAO();
        }
        View v = inflater.inflate(R.layout.fragment_item1_saved, container, false);
        thucAnAdapter = new com.example.foody.adapter.ThucAnAdapter(v.getContext(),R.layout.activity_dong_thuc_an,thucAnDAO.findAll());
        lvSavedAll = v.findViewById(R.id.lvSaved);
        lvSavedAll.setAdapter(thucAnAdapter);

        lvSavedAll.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                System.out.println(thucAnDAO.findAll().get(position).getTen());
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