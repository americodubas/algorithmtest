import org.junit.Test;

import static org.junit.Assert.*;

public class NextStateTest {

    @Test
    public void arrayNeverChange() {
        assertArrayEquals(new int[]{1,1,0,1,1,0,1,1}, NextState.change(new int[]{1,1,0,1,1,0,1,1}, 20));
    }

    @Test
    public void sameArrayAfterSevenTimes() {
        assertArrayEquals(new int[]{0,0,1,0,0,1,0,0}, NextState.change(new int[]{0,0,1,0,0,1,0,0}, 7));
    }

    @Test
    public void checkingFirstChangeAfterEightTimes() {
        assertArrayEquals(new int[]{0,1,0,1,1,0,1,0}, NextState.change(new int[]{0,0,1,0,0,1,0,0}, 8));
    }

    @Test
    public void checkingSecondChangeAfterNineTimes() {
        assertArrayEquals(new int[]{1,0,0,1,1,0,0,1}, NextState.change(new int[]{0,0,1,0,0,1,0,0}, 9));
    }
}