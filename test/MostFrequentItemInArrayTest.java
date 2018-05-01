import javafx.util.Pair;
import org.junit.Test;

import static org.junit.Assert.*;

public class MostFrequentItemInArrayTest {

    @Test
    public void findNumberOneAppearThreeTimes() {
        assertEquals(new Pair<>(1, 3),
                MostFrequentItemInArray.find(
                        new int[] {1, 3, 1, 3, 2, 1}
                ));
    }

    @Test
    public void findNumberThreeAppearFourTimes() {
        assertEquals(new Pair<>(3, 4),
                MostFrequentItemInArray.find(
                        new int[] {1, 3, 1, 3, 3, 2, 3, 1}
                ));
    }
}