package FindAlgorithms;

import java.util.HashMap;
import java.util.Map;

public class FindFirstRepeat {

    /*
        by @heiphin7

        Есть массив чисел array, необходимо вернуть индексы
        первых повторяющихся чисел

        Решение работает за O(n). Здесь используется HashMap для быстрого поиска элемента.
        Алгоритм работает так:
        Есть HashMap<K,V> -> HashMap<Integer, Integer>
        Где ключ - это значение числа, а value это его индекс
        При каждой итерации мы проверяем, есть ли уже такое число в HashMap, если есть,
        тогда просто возвращаем индекс в HashMap и номер текущей итерации
    */

    public static int[] findFirstRepeat(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            // Ищем текущее значение в map (Это делается за константное время, из за специфики HashMap)
            Integer currentIndex = map.get(array[i]);

            // Если мы нашли текущее значение в HashMap, то значит что мы нашли 2 одинаковых числа
            if (currentIndex != null) {
                // возвращаем индекс текущего числа в HashMap и текущую итерацию
                return new int[]{i, currentIndex};
            }

            // Если таких значений нету, просто кладем значения в массив
            map.put(array[i], i);
        }

        return new int[]{-1, -1};
    }
}
