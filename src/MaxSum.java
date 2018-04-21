/**
 * Return max sum in sub arrays of a given array
 */
class MaxSum {

    //Kadane's algorithm
    static int get(int[] given) {
        int current = given[0];
        int global = given[0];
        for (int i = 1; i < given.length; i++) {
            current = larger(given[i], current + given[i]);
            global = larger(current, global);
        }
        return global;
    }

    private static int larger(int first, int second) {
        return (first > second)? first : second;
    }

    //Brute force
    static int force(int[] given) {
        int larger = given[0];
        int current;
        for (int i = 0; i < given.length; i++) {
            current = sumFrom(i, given);
            if (current >  larger){
                larger = current;
            }
        }
        return larger;
    }

    private static int sumFrom(int initial, int[] given) {
        int sum = given[initial];
        if (initial == given.length - 1){
            return sum;
        }
        int larger = sum;
        for (int i = initial + 1; i < given.length; i++) {
            sum += given[i];
            if (sum > larger) {
                larger = sum;
            }
        }
        return larger;
    }

}
