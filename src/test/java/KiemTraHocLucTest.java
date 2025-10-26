import org.example.HocLuc;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KiemTraHocLucTest {
    HocLuc hocLuc;
    @BeforeEach
    public void setup(){
        hocLuc = new HocLuc();
    }

    @Test
    public void hocLucGioiVungHopLe(){
        Float diem = 8.5f;
        assertEquals("Giỏi", hocLuc.kiemTraHocLuc(diem));
    }

    @Test
    public void hocLucGioiVungKhongHopLeTren(){
        Float diem = 9.5f;
        assertEquals("Xuất sắc", hocLuc.kiemTraHocLuc(diem));
    }

    @Test
    public void hocLucGioiVungKhongHopLeDuoi(){
        Float diem = 6.5f;
        assertEquals("Trung bình", hocLuc.kiemTraHocLuc(diem));
    }

    @Test
    public void hocLucGioiBienTren(){
        Float diem = 8.9f;
        assertEquals("Giỏi", hocLuc.kiemTraHocLuc(diem));
    }

    @Test
    public void hocLucGioiBienDuoi(){
        Float diem = 7.0f;
        assertEquals("Giỏi", hocLuc.kiemTraHocLuc(diem));
    }
}
