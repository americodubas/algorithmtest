import org.junit.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FindClosestPointToOriginTest {
    private static final double DELTA = 1e-15;

    @Test
    public void calculateDistance() {
        assertEquals(5.66,
                rounding(FindClosestPointToOrigin.calculateDistance(4, 4)),
                DELTA);
    }

    @Test
    public void getThreeClosest() {
        int numberOfClosest = 3;
        List<Point> list = new ArrayList<>();
        Point a = new Point(5, 5);
        Point b = new Point(4, 5);
        Point c = new Point(3, 3);
        Point d = new Point(3, 2);
        Point e = new Point(1, 1);
        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        list.add(e);

        list = FindClosestPointToOrigin.findNClosest(list, numberOfClosest);

        assertEquals(numberOfClosest, list.size());
        assertTrue(list.contains(e) && list.contains(d) && list.contains(c));
    }

    private double rounding(double d) {
        BigDecimal b = new BigDecimal(d);
        return b.setScale(2, RoundingMode.HALF_UP).doubleValue();
    }
}