package ShiftingAlgorithms;


import java.util.Arrays;

public class LeftShifting {

    /*
        by @heiphin7

        Функция shiftToLeft, как понятно по названию, делает сдвиг влево и возврвщает новый массив
        Здесь, первый элемент уходит в конец нового массива, а все остальные элементы просто
        ставятся по индексам как указано в shiftedArray[counter] = array[i];
    */

    public static int[] shiftToLeft(int[] array) {
        int[] shiftedArray = new int[array.length];
        int counter = 0;

        for (int i = 0; i < array.length; i++) {
            // При сдвиге влево, мы первый элемент кладем как последний в новом массиве
            if(i == 0) {
                shiftedArray[array.length - 1] = array[i];
            } else {
                shiftedArray[counter] = array[i];
                counter++;
            }
        }

        return shiftedArray;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(shiftToLeft(new int[]{1, 2, 3 ,4 ,5})));
    }
}
