import org.example.TongSoLe;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TongSoLeTest {
    TongSoLe tongSoLe;
    @BeforeEach
    public void setUp(){
        tongSoLe = new TongSoLe();
    }

    @Test
    public void phanVungHopLe(){
        Integer number = 5;
        assertEquals(9, tongSoLe.tinhTongSoLe(number));
    }

    @Test
    public void phanVungKoHopLeTren(){
        Integer number = 1200;
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, ()->tongSoLe.tinhTongSoLe(number));
        assertEquals("nhap trong khoang 1 - 1000", ex.getMessage());
    }

    @Test
    public void phanVungKoHopLeDuoi(){
        Integer number = -5;
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, ()->tongSoLe.tinhTongSoLe(number));
        assertEquals("nhap trong khoang 1 - 1000", ex.getMessage());
    }

    @Test
    public void bienTren(){
        Integer number = 1000;
        assertEquals(250000,  tongSoLe.tinhTongSoLe(number));
    }

    @Test
    public void bienDuoi(){
        Integer number = 1;
        assertEquals(1, tongSoLe.tinhTongSoLe(number));
    }

    @AfterEach
    public void tearDown(){
        tongSoLe = null;
    }
}
