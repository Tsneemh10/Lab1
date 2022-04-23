package Q1;
import static org.junit.Assert.*;
import org.junit.Test;


public class EvenPartsTest {

    @Test
    public void test1(){
        assertTrue(WaterMelon.isTwoEvenParts(8) == "YES");
    }
    @Test
    public void test2(){
        assertTrue(WaterMelon.isTwoEvenParts(10) == "YES");
    }
    @Test
    public void test3(){
        assertTrue(WaterMelon.isTwoEvenParts(5) == "NO");
    }
    @Test
    public void test4(){
        assertTrue(WaterMelon.isTwoEvenParts(2) == "NO");
    }
}
