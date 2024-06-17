package AdvancedProblems;

public class MinPathSum {

    /*
        by @heiphin7

        Задача из leetcode  номером 64

       Дана двумерная матрица grid, где каждый элемент
       представляет стоимость перехода через эту клетку. Вам нужно найти путь,
       который минимизирует общую стоимость путешествия от верхнего левого угла
       (grid[0][0]) к нижнему правому углу (grid[m-1][n-1]).
       Можно двигаться только вниз или вправо.

        Задача реализована за O (n * m)
     */

    public static int findMinPathSum(int[][] grid) {
        // Новый двумерный массив, где вместе каждого элемента, минимальная сумма за которую
        // можно добраться на нее
        int[][] dp = new int[grid.length][grid[0].length];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (i == 0 && j == 0) { // for first element
                    dp[i][j] = grid[i][j];
                } else if (i == 0) { // if first columnt, but diff element in col
                    dp[i][j] = grid[i][j] + dp[i][j - 1];
                } else if (j == 0) { // if not first column but first element
                    dp[i][j] = grid[i][j] + dp[i - 1][j];
                } else { // if not first col and el

                    // Проверяем, какой элемент будет лучше, верхний или слева
                    dp[i][j] = grid[i][j] + Math.min(dp[i-1][j], dp[i][j-1]);
                }
            }
        }

        // возвращаем последний элемент, так как каждый элемент - минимальная сумма, за которую можно добраться на нее
        return dp[grid.length-1][grid[0].length-1];
    }
}
