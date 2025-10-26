import org.example.BaiHat;
import org.example.BaiHatService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BaiHatTest {
    BaiHatService baiHatService;
    @BeforeEach
    public void setup(){
        baiHatService = new BaiHatService();
    }
    @Test
    public void thoiLuongHopLe(){
        BaiHat baiHat = new BaiHat("1", "ten 1", "ca si 1", 140f,    "the loai 1");
        baiHatService.themBaiHat(baiHat);
        assertEquals(1, baiHatService.getBaiHat().size());
    }

    @Test
    public void thoiLuongQuaDai(){
        BaiHat baiHat = new BaiHat("1", "ten 1", "ca si 1", 600f,    "the loai 1");
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, ()->{
            baiHatService.themBaiHat(baiHat);
        });
        assertEquals("Thoi luong tu 2p - 5p59", ex.getMessage());
    }

    @Test
    public void thoiLuongQuaNgan(){
        BaiHat baiHat = new BaiHat("1", "ten 1", "ca si 1", 10f,    "the loai 1");
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, ()->{
            baiHatService.themBaiHat(baiHat);
        });
        assertEquals("Thoi luong tu 2p - 5p59", ex.getMessage());
    }

    @Test
    public void thoiLuongBienTren(){
        BaiHat baiHat = new BaiHat("1", "ten 1", "ca si 1", 299f,    "the loai 1");
        baiHatService.themBaiHat(baiHat);
        assertEquals(1, baiHatService.getBaiHat().size());
    }

    @Test
    public void thoiLuongBienDuoi(){
        BaiHat baiHat = new BaiHat("1", "ten 1", "ca si 1", 120f,    "the loai 1");
        baiHatService.themBaiHat(baiHat);
        assertEquals(1, baiHatService.getBaiHat().size());
    }

    @AfterEach
    public void tearDown(){
        baiHatService = null;
    }
}
