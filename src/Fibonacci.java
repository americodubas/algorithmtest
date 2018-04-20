public class Fibonacci {

    public static long get(int n) {
        if (n <= 2) {
            return 1;
        }
        long[] memo = new long[n+1];
        memo[1] = 1;
        memo[2] = 1;
        for (int i = 3; i <= n; i++) {
            memo[i] = memo[i-2] + memo[i-1];
        }
        return memo[n];
    }

}
