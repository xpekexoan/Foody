package com.example.foody.DAO;

import com.example.foody.R;
import com.example.foody.model.News_Nofication_Model;
import com.example.foody.model.RecentViewSearch_Notification_Model;

import java.util.ArrayList;
import java.util.List;

public class Notification_DAO {
    List<News_Nofication_Model> newsList;
    List<RecentViewSearch_Notification_Model> recentviewList;

    public Notification_DAO() {
        newsList = new ArrayList<>();
        recentviewList = new ArrayList<>();
    }

    public List<News_Nofication_Model> NewsList() {
        newsList.clear();
        newsList.add(new News_Nofication_Model(R.drawable.doan25k, "[DN] Món Ngon Yêu Thích chỉ 25k", "Đầu tuần đón món yêu chỉ từ 25K nè. Món no cho bữa chính, món nhẹ cho bữa xế với quá trời lựa chọn cho thời tiết se lạnh như hôm nay. Ưu đãi giảm món nhiều lắm nha, ghé chọn liền tay!", "22h"));
        newsList.add(new News_Nofication_Model(R.drawable.combostarbuck, "[DN] Rộn ràng Combo Starbucks chỉ 100k", "Chớp ngay cơ hội chanh sả để rinh về những ly cà phê thượng hạng mà giá thì không đáng lo tẹo nào. Ưu đãi giá shock cho combo 2 ly Coffee Frappuccino và Vanilla Cream Frappuccino giá chỉ 100K, ngại gì không đặt nào!!", "2d"));
        newsList.add(new News_Nofication_Model(R.drawable.now1, "[DN] Cuối tuần tiệc to MUA 1 TẶNG 1", "Cuối tuần tha hồ xả hơi, gọi ngay món ngon kèm ưu đãi MUA 1 TẶNG 1 hoặc x2 topping nè! Đủ món cho cả ngày, thả ga lựa chọn phần ngon nha!", "2d"));
        newsList.add(new News_Nofication_Model(R.drawable.now1, "[DN] [Now Table] Ưu đãi 30% - Quán ngon view đẹp, [DN] Lai rai quà vặt chỉ 15K", "Lọt Top-Trending Sài Gòn các quán đã ngon lại có view cực chất như Lẩu Tứ Xuyên, Sky View, Gang Yu,... Check ngay ưu đãi khủng khi đặt chỗ trước qua NowTable nhé.", "3d"));
        newsList.add(new News_Nofication_Model(R.drawable.combo15k, "[DN] Siêu hội NowFood món chỉ 10K, 20K, 30K", "Quà vặt xế chiều giá bao ví chỉ từ 15k thôi đó. Bánh ngọt, trà sữa, nem rán, chè khoai dẻo hay bánh mỳ cay... cái gì cũng có mà lại còn rẻ. Now ngay!", "3d"));
        newsList.add(new News_Nofication_Model(R.drawable.combo, "[DN] Chiếc Deal Yêu Chiều chỉ từ 5K", "Cùng Now ăn 1001 món giảm sập sàn chỉ còn 10k, 20k, 30k. Ngày cuối để săn siêu hội NowFood, mở tiệc ngay!", "4d"));
        newsList.add(new News_Nofication_Model(R.drawable.combo20k, "[DN] Thứ 4 - Ăn ngon chỉ nửa giá", "Siêu hội NowFood luôn ngập tràn deal hot với các món chỉ từ 20k, Aroi, House Of Cha, Phúc Drink, Pizza 4H,... và hơn 50+ quán tham gia bộ sưu tập này. Ghé Now ngay!", "4d"));
        newsList.add(new News_Nofication_Model(R.drawable.now1, "[DN] Nàng mở tiệc 20K", "Chỉ từ 5k bao la các món ngon quán hot, lại còn chiều lòng Nower với chiếc deal xịn xò có 1 không 2. Nhập mã YEUCHIEU để được giảm 20k cho đơn từ 25k. Now sẵn sàng giao, săn deal thôi nào.", "4d"));
        newsList.add(new News_Nofication_Model(R.drawable.combogiam50, "[DN] Món Ngon Yêu Thích chỉ 25k", "Trả lời cho câu nói ăn gì cũng được với loạt món ăn giảm giá với mã NUAGIA. Giảm 50% tối đa 20k đơn từ 40k, áp dụng duy nhất ngày 21/10 cho bộ sưu tập này nha", "5d"));
        newsList.add(new News_Nofication_Model(R.drawable.combo20k, "[DN] Món Ngon Yêu Thích chỉ 25k", "Tặng bạn mã DEALCHIEU GIẢM 20k khi thanh toán qua AirPay. Tự tin mở tiệc ăn thỏa thích món ngon không lo về giá nha. Đặt Now thôi!", "6d"));
        return newsList;
    }

    public List<RecentViewSearch_Notification_Model> RecentViewList() {
        recentviewList.clear();
        recentviewList.add(new RecentViewSearch_Notification_Model(R.drawable.comtam, "Cơm Tấm Mộc - Phan Thanh", "8 Phan Thanh, Quận Thanh Khê, Đà Nẵng", "Quán ăn", "121", "98", "8.7"));
        recentviewList.add(new RecentViewSearch_Notification_Model(R.drawable.buffetnuong, "BBQ Hanatei - Buffet Nướng Nhật Bản", "1 - 3 Đống Đa, P.Thuận Phước, Quận Hải Châu, Đà Nẵng", "Nhà hàng", "292", "50", "8.0"));
        recentviewList.add(new RecentViewSearch_Notification_Model(R.drawable.bunmam, "Hạnh - Bún Mắm & Bánh Tráng Đập", "45B Châu Thượng Văn, Quận Hải Châu, Đà Nẵng", "Quán ăn", "2", "2", "8.5"));
        recentviewList.add(new RecentViewSearch_Notification_Model(R.drawable.mycay, "Say - Mỳ cay & Trà Sữa", "70 Dũng Sĩ Thanh Khê, Quận Thanh Khê, Đà Nẵng", "Quán ăn", "37", "15", "8.6"));
        recentviewList.add(new RecentViewSearch_Notification_Model(R.drawable.tearex, "Tea Rex Milk Tea & Coffee", "353 Điện Biên Phủ, Quận Thanh Khê, Đà Nẵng", "Ăn vặt", "66", "19", "7.1"));
        recentviewList.add(new RecentViewSearch_Notification_Model(R.drawable.lau1nguoi, "Lẩu 1 Người", "183 Bế Văn Đàn, Quận Thanh Khê, Đà Nẵng", "Quán ăn", "518", "101", "7.5"));
        recentviewList.add(new RecentViewSearch_Notification_Model(R.drawable.fmax, "Fmax Coffee - Trà Chanh", "4 Phan Thanh, Quận Thanh Khê, Đà Nẵng", "Cafe", "69", "5", "7.4"));
        return recentviewList;
    }
}