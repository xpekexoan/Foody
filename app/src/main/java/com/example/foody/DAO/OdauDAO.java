package com.example.foody.DAO;

import com.example.foody.R;
import com.example.foody.model.Odau;

import java.util.ArrayList;
import java.util.List;

public class OdauDAO {
    List<Odau> oDauFindALL;
    List<Odau> oDauFindSaved;
    List<Odau> oDauFindPlace;

    public OdauDAO() {
        oDauFindALL =new ArrayList<>();
        oDauFindSaved = new ArrayList<>();
        oDauFindPlace = new ArrayList<>();
    }

    public List<Odau> findAll(){
        oDauFindALL.clear();
        oDauFindALL.add(new Odau("Thế giới ăn vặt", R.drawable.thucan5,15000,"20 Ông Ích Khiêm","7h","Gần đây"));
        oDauFindALL.add(new Odau("Mì quảng đại lộc", R.drawable.mi_quang,24000,"19 Điện Biên Phủ","2h","Gần đây"));
        oDauFindALL.add(new Odau("Cơm chiên gà quay", R.drawable.comchien,10000,"4 Lý Thường Kiệt","6h","Gần đâyo"));
        oDauFindALL.add(new Odau("Cơm hồng phát", R.drawable.comhongphat,20000,"112 Lý Tự Trọng","5h","Gần đây"));
        oDauFindALL.add(new Odau("Hủ tiếu bò viên", R.drawable.hutieu,50000,"112 Nguyễn Hữu Thọ","6h","Gần đây"));
        oDauFindALL.add(new Odau("Mì quảng đại lộc", R.drawable.mi_quang,15000,"50 Phan Đăng Lưu","7h","Gần đây"));
        oDauFindALL.add(new Odau("Cơm chiên gà quay", R.drawable.comchien,25000,"61 Bùi Tá Hán","3h","Gần đây"));

        return oDauFindALL;
    }
    public List<Odau> findSaved(){
        oDauFindSaved.clear();
        oDauFindSaved.add(new Odau("Tô thập cẩm", R.drawable.mi_quang,12000,"20 Ông Ích Khiêm","2h","Gần đây"));
        oDauFindSaved.add(new Odau("Kẹo Ngọt", R.drawable.thucan2,12000,"19 Điện Biên Phủ","5h","Gần đây"));
        oDauFindSaved.add(new Odau("Hủ tiếu bò viên", R.drawable.hutieu,12000,"4 Lý Thường Kiệt","2h","Gần đây"));
        oDauFindSaved.add(new Odau("Đồng tiến Bakery", R.drawable.banhmi_chao,12000,"23 Đống Đa","6h","Gần đây"));
        oDauFindSaved.add(new Odau("Phá Lấu Dì Minh", R.drawable.thucan5,12000,"112 Nguyễn Hữu Thọ","2h","Gần đây"));
        return oDauFindSaved;
    }
    public List<Odau> findPlace(){
        oDauFindPlace.clear();
        oDauFindPlace.add(new Odau("Bánh mì chảo", R.drawable.thucan1,12000,"20 Ông Ích Khiêm","2h","Gần đây"));
        return oDauFindPlace;
    }
}
