import org.example.GiaiThua;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GiaiThuaTest {
    private GiaiThua giaiThua;

    @BeforeEach
    public void setUp() {
        giaiThua = new GiaiThua();
    }

    @Test
    public void testGiaiThuatrongKhoangHopLe(){
        int n = 5;
        assertEquals(120, giaiThua.tinhGiaiThua(n));
    }

    @Test
    public void testGiaiThuatrongKhoangKoHopLeTren(){
        int n = 15;
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, ()->{
            giaiThua.tinhGiaiThua(n);
        });
        assertEquals("Nhap trong khoang 0 - 10", ex.getMessage());
    }

    @Test
    public void testGiaiThuatrongKhoangKoHopLeDuoi(){
        int n = -3;
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, ()->{
            giaiThua.tinhGiaiThua(n);
        });
        assertEquals("khong the tinh giai thua cho so < 0", ex.getMessage());
    }

    @Test
    public void testGiaiThuabienTren(){
        int n = 10;
        assertEquals(3628800, giaiThua.tinhGiaiThua(n));
    }

    @Test
    public void testGiaiThuabienDuoi(){
        int n = 1;
        assertEquals(1, giaiThua.tinhGiaiThua(n));
    }

    @Test
    public void testGiaiThuacanTrenbienTren(){
        int n = 11;
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, ()->{
            giaiThua.tinhGiaiThua(n);
        });
        assertEquals("Nhap trong khoang 0 - 10", ex.getMessage());
    }

    @Test
    public void testGiaiThuacanDuoibienTren(){
        int n = 9;
        assertEquals(362880, giaiThua.tinhGiaiThua(n));
    }

    @Test
    public void testGiaiThuacanTrenbienDuoi(){
        int n = 2;
        assertEquals(2, giaiThua.tinhGiaiThua(n));
    }

    @Test
    public void testGiaiThuacanDuoibienDuoi(){
        int n = 0;
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, ()->{
            giaiThua.tinhGiaiThua(n);
        });
        assertEquals("khong the tinh giai thua cho so < 0", ex.getMessage());
    }
}
