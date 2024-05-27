package ShiftingAlgorithms;

import java.util.Arrays;

public class RightShifting {

    /*
        by @heiphin7

        Функция shiftToRight делает 1 сдвиг вправо. При этом он учитывает что при сдвиге вправо, последний элемент
        уходит в начало массива и это учитается в первом же условном операторе в цикле.

        Далее, все элементы распределяются просто по индексам: shiftedArray[i] = array[i - 1];
    */

    public static int[] shiftToRight(int[] array) {
        int[] shiftedArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            // при сдвиге вправо, при первой же итерации мы сдвигаем последний элемнет в начало (в первый индекс)
            if(i == 0) {
                shiftedArray[0] = array[array.length-1];
            } else {
                shiftedArray[i] = array[i - 1];
            }
        }

        return shiftedArray;
    }
}
