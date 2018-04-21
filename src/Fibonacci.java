/**
 * Calculate Fibonacci number in position n
 */
class Fibonacci {

    static long get(int n) {
        //n 1 and 2 are equal to 1
        if (n <= 2) {
            return 1;
        }
        //memo with size of n+1 because we skip memo[0]
        long[] memo = new long[n+1];
        memo[1] = 1;
        memo[2] = 1;
        //use memo 1 and 2 to build up till memo[n]
        for (int i = 3; i <= n; i++) {
            memo[i] = memo[i-2] + memo[i-1];
        }
        return memo[n];
    }

}
