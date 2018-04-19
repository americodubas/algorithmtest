import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PeakTest {

    @Test
    public void sevenIsPeak() {
        int[] given = new int[]{1, 2, 3, 4, 5, 6, 7};
        assertEquals(6, Peak.find(given, 0, given.length - 1));
        assertEquals(6, Peak.force(given));
    }

    @Test
    public void sixIsPeak() {
        int[] given = new int[]{1, 2, 6, 5, 3, 7, 4};
        assertEquals(2, Peak.find(given, 0, given.length - 1));
        assertEquals(2, Peak.force(given));
    }

    @Test
    public void fiveIsPeak() {
        //just because of the first if, it'll choose left first
        int[] given = new int[]{5, 4, 3, 2, 1, 2, 3, 4};
        assertEquals(0, Peak.find(given, 0, given.length - 1));
        assertEquals(0, Peak.force(given));
    }

}