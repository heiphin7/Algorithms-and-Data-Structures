package ShiftingAlgorithms;


public class LeftShifting {

    /*

    */

    public static int[] shiftToLeft(int[] array) {
        int[] shiftedArray = new int[array.length];
        int counter = 0;

        for (int i = 0; i < array.length; i++) {
            // При сдвиге вправо, мы первый элемент кладем как последний в новом массиве
            if(i == 0) {
                shiftedArray[array.length - 1] = array[i];
            } else {
                shiftedArray[counter] = array[i];
                counter++;
            }
        }

        return shiftedArray;
    }
}
