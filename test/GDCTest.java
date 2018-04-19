import org.junit.Test;

import static org.junit.Assert.*;

public class GDCTest {

    @Test
    public void getGDC1() {
        assertEquals(1, GDC.getGDC(new int[]{2,3,4,5,6}));
    }

    @Test
    public void getGDC2() {
        assertEquals(2, GDC.getGDC(new int[]{2,4,6,8,10}));
    }

    @Test
    public void getGDC1000() {
        assertEquals(1000, GDC.getGDC(new int[]{1000,1000,1000,2000}));
    }
}