import org.example.FunctionTwo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FuntionTwoTest {
    private FunctionTwo functionTwo;

    @BeforeEach
    public void setup(){
        functionTwo = new FunctionTwo();
    }

    @Test
    public void test_hople_KiemTraSoChan(){
        int a = 6;
        assertEquals("so chan", functionTwo.checking(a));
    }

    @Test
    public void test_hople_KiemTraSoLe(){
        int a = 5;
        assertEquals("so le", functionTwo.checking(a));
    }

    @Test
    public void test_kiemTraSo0(){
        int a = 0;
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () ->{
            functionTwo.checking(a);
        });
        assertEquals("so 0 khong phai so chan hoac so le", ex.getMessage());
    }

    @Test
    public void test_kiemTraSo1(){
        int a = 1;
        assertEquals("so le", functionTwo.checking(a));
    }

    @Test
    public void test_kiemTraSo1000(){
        int a = 1000;
        assertEquals("so chan", functionTwo.checking(a));
    }

    @Test
    public void test_kiemTraSo1001(){
        int a = 1001;
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () ->{
            functionTwo.checking(a);
        });
        assertEquals("a phai nam trong khoang 0 - 1000", ex.getMessage());
    }

    @Test
    public void test_kiemTraSoAm1(){
        int a = -1;
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () ->{
            functionTwo.checking(a);
        });
        assertEquals("a phai nam trong khoang 0 - 1000", ex.getMessage());
    }

}
