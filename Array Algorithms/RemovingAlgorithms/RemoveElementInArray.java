package RemovingAlgorithms;

public class RemoveElementInArray {

    /*
        by @heiphin7
        Алгоритм для удаления элемента из массива по индексу.
        Метод возвращает новый массив, новой длины и с обновленными местами элемнетов
     */

    public static int[] removeElementByIndex(int[] array, int index) {
        if (array.length - 1 < index || array.length < 1 || index < 0) {
            return new int[]{-1};
        }

        int[] newArray = new int[array.length - 1];
        int indexCounter = 0;

        for (int i = 0; i < array.length; i++) {
            if (i != index) {
                newArray[indexCounter] = array[i];
                indexCounter++;
            }
        }

        return newArray;
    }
}
