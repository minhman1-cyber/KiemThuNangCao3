import org.example.Calculator;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    public void setUp(){
        calculator = new Calculator();
    }

    @Test
    public void testAdd_hopLe_vungHopLe(){
        int a = 10;
        int b = 10;
        assertEquals(20,calculator.add(a,b));
    }

    @Test
    public void testAdd_kohopLe_vungKhongHopLeDuoi(){
        int a = -4;
        int b = 10;
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () ->{
           calculator.add(a,b);
        });
        assertEquals("Moi phan tu lon hon 0",ex.getMessage());
    }

    @Test
    public void testAdd_kohopLe_vungKhongHopLeTren(){
        int a = 1500;
        int b = 10;
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () ->{
            calculator.add(a,b);
        });
        assertEquals("Moi phan tu nho hon 1000",ex.getMessage());
    }

    @Test
    public void testAdd_hopLe_bienDuoi(){
        int a = 1;
        int b = 10;
        assertEquals(11,calculator.add(a,b));
    }

    @Test
    public void testAdd_hopLe_bienTren(){
        int a = 1000;
        int b = 10;
        assertEquals(1010,calculator.add(a,b));
    }

    @Test
    public void testAdd_kohopLe_canTrenbienTren(){
        int a = 1001;
        int b = 10;
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () ->{
            calculator.add(a,b);
        });
        assertEquals("Moi phan tu nho hon 1000",ex.getMessage());
    }
    @Test
    public void testAdd_hopLe_canDuoibienTren(){
        int a = 999;
        int b = 10;
        assertEquals(1009,calculator.add(a,b));
    }
    @Test
    public void testAdd_hopLe_canTrenbienDuoi(){
        int a = 1;
        int b = 10;
        assertEquals(11,calculator.add(a,b));
    }
    @Test
    public void testAdd_kohopLe_canDuoibienDuoi(){
        int a = -1;
        int b = 10;
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () ->{
            calculator.add(a,b);
        });
        assertEquals("Moi phan tu lon hon 0",ex.getMessage());
    }
}
