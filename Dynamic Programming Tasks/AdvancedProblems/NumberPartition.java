package AdvancedProblems;

public class NumberPartition {

    /*
        by @heiphin7

        Определить количество способов, которыми заданное натуральное число 𝑛
        n можно разбить на сумму положительных целых чисел, причём порядок слагаемых не важен.

    */

    public static int countPartition(int n) {
        int[] dp = new int[n + 1];

        dp[0] = 1;

        for(int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                dp[i] += dp[j-i];
            }
        }

        return dp[n];
    }

}
