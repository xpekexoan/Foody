package com.example.foody.model;

import com.example.foody.R;

import java.util.ArrayList;
import java.util.List;

public class KhamPhaDAO {
    List<KhamPha> khamphaFindALL;
    List<KhamPha> khamphaFindSaved;
    List<KhamPha> khamphaFindPlace;

    public KhamPhaDAO() {
        khamphaFindALL =new ArrayList<>();
        khamphaFindSaved = new ArrayList<>();
        khamphaFindPlace = new ArrayList<>();
    }

    public List<KhamPha> findAll(){
        khamphaFindALL.clear();
        khamphaFindALL.add(new KhamPha("Bánh mì chảo", R.drawable.banhmi_chao,15000,"20 Ông Ích Khiêm","7h","Gần đây"));
        khamphaFindALL.add(new KhamPha("Bánh mì ngon tuyệt", R.drawable.banhmi,24000,"19 Điện Biên Phủ","2h","Gần đây"));
        khamphaFindALL.add(new KhamPha("Chè thái Na Na", R.drawable.chethai,10000,"4 Lý Thường Kiệt","6h","Gần đâyo"));
        khamphaFindALL.add(new KhamPha("Cơm hồng phát", R.drawable.comhongphat,20000,"112 Lý Tự Trọng","5h","Gần đây"));
        khamphaFindALL.add(new KhamPha("Thế giới ăn vặt", R.drawable.thucan5,50000,"112 Nguyễn Hữu Thọ","6h","Gần đây"));
        khamphaFindALL.add(new KhamPha("Mì quảng đại lộc", R.drawable.mi_quang,15000,"50 Phan Đăng Lưu","7h","Gần đây"));
        khamphaFindALL.add(new KhamPha("Cơm chiên gà quay", R.drawable.comchien,25000,"61 Bùi Tá Hán","3h","Gần đây"));

        return khamphaFindALL;
    }
    public List<KhamPha> findSaved(){
        khamphaFindSaved.clear();
        khamphaFindSaved.add(new KhamPha("Tô thập cẩm", R.drawable.mi_quang,12000,"20 Ông Ích Khiêm","2h","Gần đây"));
        khamphaFindSaved.add(new KhamPha("Kẹo Ngọt", R.drawable.thucan2,12000,"19 Điện Biên Phủ","5h","Gần đây"));
        khamphaFindSaved.add(new KhamPha("Hủ tiếu bò viên", R.drawable.hutieu,12000,"4 Lý Thường Kiệt","2h","Gần đây"));
        khamphaFindSaved.add(new KhamPha("Đồng tiến Bakery", R.drawable.banhmi_chao,12000,"23 Đống Đa","6h","Gần đây"));
        khamphaFindSaved.add(new KhamPha("Phá Lấu Dì Minh", R.drawable.thucan5,12000,"112 Nguyễn Hữu Thọ","2h","Gần đây"));
        return khamphaFindSaved;
    }
    public List<KhamPha> findPlace(){
        khamphaFindPlace.clear();
        khamphaFindPlace.add(new KhamPha("Bánh mì chảo", R.drawable.thucan1,12000,"20 Ông Ích Khiêm","2h","Gần đây"));
        return khamphaFindPlace;
    }
}
