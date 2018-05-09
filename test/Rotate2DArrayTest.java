import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Rotate2DArrayTest {

    private int[][] array1, array2, result1, result2;

    @Before
    public void init() {
        // NOTE: The following input values will be used for testing your solution.
        array1 = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        // rotate(a1, 3) should return:
        result1 = new int[][]{
                {7, 4, 1},
                {8, 5, 2},
                {9, 6, 3}};

        array2 = new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
        // rotate(a2, 4) should return:
        result2 = new int[][]{
                {13, 9, 5, 1},
                {14, 10, 6, 2},
                {15, 11, 7, 3},
                {16, 12, 8, 4}};
    }

    @Test
    public void rotateArray1() {
        assertArrayEquals(result1, Rotate2DArray.rotate(array1, 3));
    }

    @Test
    public void rotateArray2() {
        assertArrayEquals(result2, Rotate2DArray.rotate(array2, 4));
    }
}