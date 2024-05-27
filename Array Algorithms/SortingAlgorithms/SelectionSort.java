package SortingAlgorithms;

public class SelectionSort {

    /*
        by @heiphin7

        Простая реализация выборочной сортировки
    */

    public static int[] selectionSort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            // Изначально, минимальным значением будет i-ий элемент итерации
            int min = array[i];
            int indexOfMin = i;

            // Проходимся по циклу и ищем значение, которое меньше изначально заданного
            for (int j = i + 1; j < array.length; j++) {
                if(array[j] < min) {
                    min = array[j];
                    indexOfMin = j;
                }
            }

            // Если минимальное значение поменялось, меняем местами
            if (indexOfMin != i) {
               int temp = array[i];
               array[i] = array[indexOfMin];
               array[indexOfMin] = temp;
            }
        }
        return array;
    }
}
