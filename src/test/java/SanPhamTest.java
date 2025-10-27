import org.example.SanPham;
import org.example.SanPhamService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SanPhamTest {
    SanPhamService sanPhamService;
    @BeforeEach
    public void setup() {
        sanPhamService = new SanPhamService();
    }

    @Test
    public void themHopLe(){
        SanPham sanPham = new SanPham("2", "ten 1", 2, 45f, 4, "danh muc 1");
        sanPhamService.them(sanPham);
        assertEquals(2, sanPhamService.getList().size());
    }

    @Test
    public void themKoHopLeTren(){
        SanPham sanPham = new SanPham("2", "ten 1", 2, 45f, 140, "danh muc 1");
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> sanPhamService.them(sanPham));
        assertEquals("So luong tu 1 - 100", ex.getMessage());
    }

    @Test
    public void themKoHopLeDuoi(){
        SanPham sanPham = new SanPham("2", "ten 1", 2, 45f, 0, "danh muc 1");
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> sanPhamService.them(sanPham));
        assertEquals("So luong tu 1 - 100", ex.getMessage());
    }

    @Test
    public void themBienTren(){
        SanPham sanPham = new SanPham("2", "ten 1", 2, 45f, 100, "danh muc 1");
        sanPhamService.them(sanPham);
        assertEquals(2, sanPhamService.getList().size());
    }

    @Test
    public void themBienDuoi(){
        SanPham sanPham = new SanPham("2", "ten 1", 2, 45f, 1, "danh muc 1");
        sanPhamService.them(sanPham);
        assertEquals(2, sanPhamService.getList().size());
    }

    @Test
    public void sanPhamTonTai(){
        SanPham sanPham = new SanPham("1", "ten 1", 2, 45f, 100, "danh muc 1");
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> sanPhamService.them(sanPham));
        assertEquals("San pham da ton tai", ex.getMessage());
    }

    @AfterEach
    public void teardown() {
        sanPhamService = null;
    }
}
