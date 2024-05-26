package FindAlgorithms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MaxSumSubArray {

    /*
        by @heiphin7

        Задача: Написать функцию, которая принимает массив и целевое значение,
        и возвращает индексы пару чисел в массиве, сумма которых больше любой другой комбинации чисел,
        Если таких чисел нет, вернуть массив {-1, -1}.

    */

    public static int[] maxSumSubArray(int[] array) {
        if (array.length < 2) {
            return new int[]{-1, -1}; // Возвращаем {-1, -1}, если массив содержит менее двух элементов
        }

        int[] answer = new int[]{-1, -1};
        int maxSum = array[0] + array[1];

        for (int i = 2; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] + array[j] > maxSum) {
                    maxSum = array[i] + array[j];
                    answer[0] = i;
                    answer[1] = j;
                }
            }
        }

        return answer;
    }
}
