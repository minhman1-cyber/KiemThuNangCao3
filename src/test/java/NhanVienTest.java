import org.example.NhanVien;
import org.example.NhanVienService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NhanVienTest {
    private NhanVienService nhanVienService;
    @BeforeEach
    public void setUp() {
        nhanVienService = new NhanVienService();
    }

    @Test
    public void addNhanVien1(){
        NhanVien nhanVien1 = new NhanVien(1, "nhan vien 1", "phong ban 1", 5);
        nhanVienService.addNhanVien(nhanVien1);
        assertEquals(1, nhanVienService.getList().size());
    }

    @Test
    public void suaNhanVien1(){
        NhanVien nhanVien1 = new NhanVien(1, "nhan vien 1", "phong ban 1", 5);
        nhanVienService.updateNhanVien(nhanVien1);
        assertEquals("nhan vien 1", nhanVienService.nhanVien.getTenNhanVien());
    }
}
