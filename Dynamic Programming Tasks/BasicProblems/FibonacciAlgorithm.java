package BasicProblems;

public class FibonacciAlgorithm {

    /*
        by @heiphin7

        Базовая реализация фибоначчи в котором используется
        динамическое программирование и рекурсия
    */

    // with dynamic programming

    public static int fibonaccidp(int n) {
        if (n <= 1) { // if 1 or 0
            return n;
        }

        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];
    }



    // with recursion
    public static int fibonacciRecursion(int a) {
        if (a == 0) return 0;
        if (a == 1) return 1;
        return fibonacciRecursion(a-1) + fibonacciRecursion(a-2);
    }
}
