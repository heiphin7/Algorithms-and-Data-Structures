package FindAlgorithms;

public class FindTwoSum {

    /*

        by @heiphin7

        Классическая задача TwoSum.
        Дан массив целых чисел array и целое число target.
        Необходимо найти индексы целых чисел в массиве так, чтобы при
        сложении получить target. Если нет таковых, вернуть массив {-1, -1}

        Время выполнения O(n^2)
    */

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
