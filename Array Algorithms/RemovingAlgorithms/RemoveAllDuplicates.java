package RemovingAlgorithms;

import java.util.Arrays;
import java.util.HashMap;

public class RemoveAllDuplicates {

    /*
        by @heiphin7

        RemoveAllDupliates - функция, которая удаляет все дупликаты из массива и затем возвращает массив
        с уникальными значениями и с нужной длиной (без null-значений и тому подобное)

        Алгоритм Реализован за O(N)

        Здесь я использовал map для отслеживания, встречалось ли каждое из чисел уже в массива.
        Для этого в начале каждой итерации мы проверяем было ли текущее число уже в массиве.
        Если да, тогда мы добавляем его в новый массив
    */

    public static int[] removeAllDuplicates(int[] array) {
        // в HashMap бы будем хранить уникальные элементы
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] arrayWithOutDuplicates = new int[array.length];
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            Integer currentIntegerInMap = map.get(array[i]);

            if(currentIntegerInMap == null) {
                arrayWithOutDuplicates[counter] = array[i];
                counter++;
            }

            map.put(array[i], array[i]);
        }

        // Создаем массив нужной длины и копируем уникальные элементы
        int[] result = new int[counter];
        System.arraycopy(arrayWithOutDuplicates, 0, result, 0, counter);

        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(removeAllDuplicates(new int[]{1, 1, 2, 3, 4, 5, 5, 3, 3})));
    }

}
