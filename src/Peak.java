/**
 * Find a peak in a given array of numbers
 */
class Peak {

    //Divide and Conquer
    static int find(int[] array, int begin, int end) {
        int m = getMiddle(begin, end);
        if (isLeftNumberBigger(array, begin, m)) {
            //continue left
            return find(array, begin, m - 1);
        } else if (isRightNumberBigger(array, end, m)) {
            //continue right
            return find(array, m + 1, end);
        } else {
            //if left number and right number aren't bigger then m is a peak
            return m;
        }

    }

    private static int getMiddle(int begin, int end) {
        return (begin + end) / 2;
    }

    private static boolean isRightNumberBigger(int[] array, int end, int m) {
        return m + 1 <= end && array[m] < array[m + 1];
    }

    private static boolean isLeftNumberBigger(int[] array, int begin, int m) {
        return m - 1 >= begin && array[m - 1] > array[m];
    }

    //Brute force checking all values
    static int force(int[] array){
        for (int i = 0; i < array.length; i++){
            boolean greaterThanLeft = i - 1 < 0 || array[i - 1] <= array[i];
            boolean greaterThanRight = i + 1 == array.length || array[i] >= array[i + 1];
            if (greaterThanLeft && greaterThanRight) {
                return i;
            }
        }
        return 0;
    }

}
