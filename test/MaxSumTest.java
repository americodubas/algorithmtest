import org.junit.Test;

import static org.junit.Assert.*;

public class MaxSumTest {

    @Test
    public void getForce3() {
        assertEquals(3, MaxSum.force(new int[]{1,2,-5,2}));
    }

    @Test
    public void getForce5() {
        assertEquals(5, MaxSum.force(new int[]{-2,3,2,-1}));
    }

    @Test
    public void get3() {
        assertEquals(3, MaxSum.get(new int[]{1,2,-5,2}));
    }

    @Test
    public void get5() {
        assertEquals(5, MaxSum.get(new int[]{-2,3,2,-1}));
    }
}