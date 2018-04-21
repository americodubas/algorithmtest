import org.junit.Test;

import static org.junit.Assert.*;

public class AreaOverlappingRectanglesTest {

    @Test
    public void getArea1() {
        //lowerX lowerY higherX higherY
        int[] firstRectangle = new int[]{2,1,5,5};
        int[] secondRectangle = new int[]{3,2,5,7};

        assertEquals(6, AreaOverlappingRectangles.getArea(firstRectangle, secondRectangle));
    }

    @Test
    public void getArea2() {
        //lowerX lowerY higherX higherY
        int[] firstRectangle = new int[]{2,2,6,6};
        int[] secondRectangle = new int[]{3,3,4,7};

        assertEquals(3, AreaOverlappingRectangles.getArea(firstRectangle, secondRectangle));
    }
}