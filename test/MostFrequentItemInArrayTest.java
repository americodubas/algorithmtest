import javafx.util.Pair;
import org.junit.Test;

import static org.junit.Assert.*;

public class MostFrequentItemInArrayTest {

    @Test
    public void shouldReturnOneThreeTimes() {
        assertEquals(new Pair<>(1, 3),
                MostFrequentItemInArray.find(
                        new int[] {1, 3, 1, 3, 2, 1}
                ));
    }

    @Test
    public void shouldReturnThreeThreeTimes() {
        assertEquals(new Pair<>(3, 3),
                MostFrequentItemInArray.find(
                        new int[] {3, 3, 1, 3, 2, 1}
                ));
    }

    @Test
    public void shouldReturnNull() {
        assertNull(
                MostFrequentItemInArray.find(
                        new int[] {}
                ));
    }

    @Test
    public void shouldReturnZeroOneTime() {
        assertEquals(new Pair<>(0, 1),
                MostFrequentItemInArray.find(
                        new int[] {0}
                ));
    }

    @Test
    public void shouldReturnMinusOneFiveTimes() {
        assertEquals(new Pair<>(-1, 5),
                MostFrequentItemInArray.find(
                        new int[] {0, -1, 10, 10, -1, 10, -1, -1, -1, 1}
                ));
    }
}