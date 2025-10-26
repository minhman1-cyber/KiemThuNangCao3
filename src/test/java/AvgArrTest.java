import org.example.AverageArray;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AvgArrTest {
    private AverageArray averageArray;

    @BeforeEach
    public void setup(){
        averageArray = new AverageArray();
    }

    @Test
    public void tinhAVGtrongKhoangHopLe(){
        int[] arr = {1,2,3,4,5,6};
        assertEquals(3.5f, averageArray.avgArr(arr));
    }

    @Test
    public void tinhAVGvoi11phantu(){
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11};
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, ()->{
            averageArray.avgArr(arr);
        });
        assertEquals("do dai cua mang toi da la 10 phan tu", ex.getMessage());
    }

    @Test
    public void tinhAVGvoi0phantu(){
        int[] arr = {};
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, ()->{
            averageArray.avgArr(arr);
        });
        assertEquals("mang khong duoc rong", ex.getMessage());
    }

    @Test
    public void tinhAVGvoi10phantu(){
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        assertEquals(5.5f, averageArray.avgArr(arr));
    }

    @Test
    public void tinhAVGvoi1phantu(){
        int[] arr = {1};
        assertEquals(1, averageArray.avgArr(arr));
    }

    @Test
    public void tinhAVGvoi9phantu(){
        int[] arr = {1,2,3,4,5,6,7,8,9};
        assertEquals(5.0f, averageArray.avgArr(arr));
    }

    @Test
    public void tinhAVGvoi2phantu(){
        int[] arr = {1,2};
        assertEquals(1.5f, averageArray.avgArr(arr));
    }




}
