import org.junit.Test;

import static org.junit.Assert.*;

public class CommonElementsInTwoArraysTest {

    @Test
    public void shouldReturnOneFourNine() {
        int[] array1 = {1, 3, 4, 6, 7, 9};
        int[] array2 = {1, 2, 4, 5, 9, 10};
        Integer[] result = {1, 4, 9};

        assertArrayEquals(result, CommonElementsInTwoArrays.find( array1, array2));
    }

    @Test
    public void shouldReturnOneTwoNineTenTwelve() {
        int[] array1 = {1, 2, 9, 10, 11, 12};
        int[] array2 = {0, 1, 2, 3, 4, 5, 8, 9, 10, 12, 14, 15};
        Integer[] result = {1, 2, 9, 10, 12};

        assertArrayEquals(result, CommonElementsInTwoArrays.find( array1, array2));
    }

    @Test
    public void shouldReturnEmpty() {
        int[] array1 = {0, 1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10, 11};
        Integer[] result = {};

        assertArrayEquals(result, CommonElementsInTwoArrays.find( array1, array2));
    }
}