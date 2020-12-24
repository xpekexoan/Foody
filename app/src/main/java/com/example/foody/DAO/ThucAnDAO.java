package com.example.foody.DAO;

import com.example.foody.R;
import com.example.foody.model.ThucAn;

import java.util.ArrayList;
import java.util.List;

public class ThucAnDAO {
    List<ThucAn> thucAnFindALL;
    List<ThucAn> thucAnFindSaved;
    List<ThucAn> thucAnFindPlace;

    public ThucAnDAO() {
        thucAnFindALL =new ArrayList<>();
        thucAnFindSaved = new ArrayList<>();
        thucAnFindPlace = new ArrayList<>();
    }

    public List<ThucAn> findAll(){
        thucAnFindALL.clear();
        thucAnFindALL.add(new ThucAn("Trà sữa Thái xanh", R.drawable.thucan1,12000,"61 Bùi Tá Hán","2h","Lưu vào"));
        thucAnFindALL.add(new ThucAn("Bánh mì",R.drawable.thucan2,12000,"61 Hải Phòng","2h","Lưu vào"));
        thucAnFindALL.add(new ThucAn("Chè thái Na Na",R.drawable.thucan3,12000,"4 Lý Thường Kiệt","2h","Lưu vào"));
        thucAnFindALL.add(new ThucAn("Cơm hồng phát",R.drawable.thucan4,12000,"112 Nguyễn Hữu Thọ","2h","Lưu vào"));
        thucAnFindALL.add(new ThucAn("Thế giới ăn vặt",R.drawable.thucan5,12000,"112 Nguyễn Hữu Thọ","2h","Lưu vào"));
        thucAnFindALL.add(new ThucAn("Mì quảng đại lộc",R.drawable.thucan5,12000,"12 Nguyễn Hữu Thọ","2h","Lưu vào"));
        thucAnFindALL.add(new ThucAn("Cơm chiên gà quay",R.drawable.thucan5,12000,"61 Bùi Tá Hán","2h","Lưu vào"));

        return thucAnFindALL;
    }
    public List<ThucAn> findSaved(){
        thucAnFindSaved.clear();
        thucAnFindSaved.add(new ThucAn("Trà sữa Thái xanh", R.drawable.thucan1,12000,"12 Bùi Tá Hán","2h","Lưu vào"));
        thucAnFindSaved.add(new ThucAn("Trà sữa Thái xanh",R.drawable.thucan2,12000,"61 Hải Phòng","2h","Lưu vào"));
        thucAnFindSaved.add(new ThucAn("Trà sữa Thái xanh",R.drawable.thucan3,12000,"4 Lý Thường Kiệt","2h","Lưu vào"));
        thucAnFindSaved.add(new ThucAn("Trà sữa Thái xanh",R.drawable.thucan4,12000,"23 Đống Đa","2h","Lưu vào"));
        thucAnFindSaved.add(new ThucAn("Trà sữa Thái xanh",R.drawable.thucan5,12000,"112 Nguyễn Hữu Thọ","2h","Lưu vào"));
        return thucAnFindSaved;
    }
    public List<ThucAn> findPlace(){
        thucAnFindPlace.clear();
        thucAnFindPlace.add(new ThucAn("Trà sữa Thái xanh", R.drawable.thucan1,12000,"61 Bùi Tá Hán","2h","Lưu vào"));
        return thucAnFindPlace;
    }
}
