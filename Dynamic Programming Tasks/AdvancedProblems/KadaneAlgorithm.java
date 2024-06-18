package AdvancedProblems;

public class KadaneAlgorithm {

    /*
        by @heiphin7

        Реализация алгоритма Кадане.
        алгоритм Кадане — это метод динамического программирования,
        позволяющий найти подмассив максимальной непрерывной суммы.
        Если вы последуете примеру или коду, вы увидите,
        что мы используем только один цикл
    */

    public static int kadane(int[] array) {
        if (array.length == 0) return 0;

        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum = Math.max(array[i], array[i] + sum);

            if (sum > max) {
                max = sum;
            }
        }

        return max;
    }
}
