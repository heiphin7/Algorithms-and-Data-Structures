package FindAlgorithms;

public class FindTargetInArray {

    /*
        by @heiphin7
        Алгоритм поиска значения в массиве, которая работает за O(n) - линейное время работы
    */

    public static int findInArray(int[] array, int target) {
        // Сравниваем каждый элемент массива с нужным
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                // Если текущий элемент в массиве равен цели - возвращаем его
                return i;
            }
        }

        // Если значение не найдено, возвращаем -1
        return -1;
    }
}
