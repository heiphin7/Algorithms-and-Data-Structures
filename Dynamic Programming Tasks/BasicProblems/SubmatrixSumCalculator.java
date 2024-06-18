package BasicProblems;

public class SubmatrixSumCalculator {

    /*
        by @heiphin7

        Есть двумерный массив и нужно найти и вернуть сумму его максимальной подстроки.
    */

    public static int maxSubmatrixSum(int[][] grid) {
        int currentMax = Integer.MIN_VALUE;

        for (int i = 0; i < grid.length; i++) {
            int currentSum = 0;
            for (int j = 0; j < grid[i].length; j++) {
                currentSum += grid[i][j];
            }

            if (currentSum > currentMax) {
                currentMax = currentSum;
            }
        }

        return currentMax;
    }
}
