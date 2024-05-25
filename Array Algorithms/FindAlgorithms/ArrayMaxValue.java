package FindAlgorithms;

public class ArrayMaxValue {

    public static int findMaxInArray(int[] array) {

        // Если передан пустой массив, возвращаем значение 0
        if(array == null || array.length == 0) {
            return -1;
        }

        // По умолчанию максимальным значением будет первый элемент в массиве
        int maxValue = array[0];

        // Начинаем цикл со второго элемента, так как первый элемент уже используется
        for (int i = 1; i < array.length; i++) {
            if(array[i] > maxValue) {
                maxValue = array[i];
            }
        }

        return maxValue;
    }

}
