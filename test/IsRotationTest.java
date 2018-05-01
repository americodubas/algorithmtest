import org.junit.Test;

import static org.junit.Assert.*;

public class IsRotationTest {

    private int[] array1 = {1, 2, 3, 4, 5, 6, 7};

    private int[] array2a = {4, 5, 6, 7, 8, 1, 2, 3};
    // isRotation(array1, array2a) should return false.
    private int[] array2b = {4, 5, 6, 7, 1, 2, 3};
    // isRotation(array1, array2b) should return true.
    private int[] array2c = {4, 5, 6, 9, 1, 2, 3};
    // isRotation(array1, array2c) should return false.
    private int[] array2d = {4, 6, 5, 7, 1, 2, 3};
    // isRotation(array1, array2d) should return false.
    private int[] array2e = {4, 5, 6, 7, 0, 2, 3};
    // isRotation(array1, array2e) should return false.
    private int[] array2f = {1, 2, 3, 4, 5, 6, 7};
    // isRotation(array1, array2f) should return true.

    @Test
    public void shouldReturnFalseFor2A() {
        assertFalse(IsRotation.of(array1, array2a));
    }

    @Test
    public void shouldReturnTrueFor2B() {
        assertTrue(IsRotation.of(array1, array2b));
    }

    @Test
    public void shouldReturnFalseFor2C() {
        assertFalse(IsRotation.of(array1, array2c));
    }

    @Test
    public void shouldReturnFalseFor2D() {
        assertFalse(IsRotation.of(array1, array2d));
    }

    @Test
    public void shouldReturnFalseFor2E() {
        assertFalse(IsRotation.of(array1, array2e));
    }

    @Test
    public void shouldReturnTrueFor2F() {
        assertTrue(IsRotation.of(array1, array2f));
    }

}