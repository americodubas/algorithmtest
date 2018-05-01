import java.util.ArrayList;

/**
 * Find the common numbers in two given arrays
 * Try to solve it in O(max(n,m))
 */
class CommonElementsInTwoArrays {

    static Integer[] find(int[] givenOne, int [] givenTwo) {

        ArrayList<Integer> common = new ArrayList<>();
        int i = 0, j = 0;

        while (i < givenOne.length && j < givenTwo.length) {
            if ( givenOne[i] == givenTwo[j] ) {
                common.add(givenOne[i]);
                i++;
                j++;
                continue;
            }

            if ( givenOne[i] > givenTwo[j] ) {
                j++;
            } else {
              i++;
            }

        }

        Integer[] result = new Integer[common.size()];
        return common.toArray(result);
    }

}
