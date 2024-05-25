package FindAlgorithms;

public class ArrayMinValue {

    /*
        by @heiphin7

        Простой алгоритм для поиска минимального значения в массиве чисел
        которая работает за O(n), - линейное время работы
    */

    public static int findMinInArray(int[] array) {

        // Если передан пустой массив, тогда мы просто возвращаем значение -1
        if (array == null || array.length == 0) {
            return -1;
        }

        // По умолчанию минимальным значением будет первый элемент в массиве
        int minValue = array[0];

        // Начинаем цикл со второго элемента, так как первый элемент уже используется
        for (int i = 1; i < array.length; i++) {
            if(array[i] < minValue) {
                minValue = array[i];
            }
        }

        return minValue;
    }
}