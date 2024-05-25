package FindAlgorithms;

import java.util.HashMap;
import java.util.Map;

public class FindTwoSum {

    /*

        by @heiphin7

        Классическая задача TwoSum.
        Дан массив целых чисел array и целое число target.
        Необходимо найти индексы целых чисел в массиве так, чтобы при
        сложении получить target. Если нет таковых, вернуть массив {-1, -1}

        Время выполнения O(n^2)

        update: Добавлена новая версия, которая работает за O(n)
        Добавлено использование HashMap для оптимизации программы чуть ли не вдвое.
        HashMap был использован, так как в нем нахождение объекта по ключу происходит
        за линейное время

       new version with
     */
    public static int[] findTwoSumV2(int[] array, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            Integer currentIndex = map.get(array[i]);

            if(currentIndex != null) {
                return new int[]{i, currentIndex};
            }

            map.put(target - array[i], i);
        }

        return new int[]{-1, -1};
    }



    // old version
    public static int[] findTwoSum(int[] array, int target) {

        // Просто в лоб проходимся по циклу, используя 2 цикла и ищем значение
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if(array[i] + array[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{-1, -1};
    }
}
