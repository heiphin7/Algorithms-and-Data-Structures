package BasicProblems;

public class PathCounter {

    /*
        by @heiphin7

        Определить количество различных путей, которыми кролик
        может переместиться из левого верхнего угла (начальной точки)
         в правый нижний угол (конечную точку) на прямоугольной сетке.
         Кролик может двигаться только вправо или вниз.

         Задача реализована за O(N * M) с использованием динамического программирования
    */

    public static int findPathCount(int[][] grid) {
        if (grid.length == 0) {
            return 0;
        }

        int[][] dp = new int[grid.length][grid[0].length];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (i == 0 && j == 0) {
                    dp[i][j] = 1;
                } else if (i == 0) {
                    dp[i][j] = dp[i][j-1];
                } else if (j == 0) {
                    dp[i][j] = dp[i-1][j];
                } else {
                    dp[i][j] = dp[i-1][j] + dp[i][j-1];
                }
            }
        }

        return dp[dp.length-1][dp[0].length-1];
    }
}
