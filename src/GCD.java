/**
 * Calculate the greatest common divisor
 */
class GCD {

    static int get(int[] given) {
        int smallest = getSmallest(given);
        //divide from the smallest given number till 1
        for (int div = smallest; div >= 1; div--) {
            int i = 0;
            for (; i < given.length; i++) {
                if (given[i] % div != 0) {
                    break;
                }
            }
            //if given[i] was able to divide all numbers then it is the GCD
            if (i == given.length) {
                return div;
            }
        }

        return 1;
    }

    private static int getSmallest(int[] given) {
        int smallest = given[0];
        for (int i : given) {
            if (i < smallest) {
                smallest = i;
            }
        }
        return smallest;
    }

}
