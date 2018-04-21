import org.junit.Test;

import static org.junit.Assert.*;

public class GCDTest {

    @Test
    public void getGCD1() {
        assertEquals(1, GCD.get(new int[]{2,3,4,5,6}));
    }

    @Test
    public void getGCD2() {
        assertEquals(2, GCD.get(new int[]{2,4,6,8,10}));
    }

    @Test
    public void getGCD1000() {
        assertEquals(1000, GCD.get(new int[]{1000,1000,1000,2000}));
    }
}