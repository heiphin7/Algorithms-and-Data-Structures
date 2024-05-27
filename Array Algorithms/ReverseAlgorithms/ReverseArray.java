package ReverseAlgorithms;


public class ReverseArray {

    /*
        by @heiphin7

        Простой алгоритм для переворачивания массива
    */

    public static int[] reverse(int[] array) {
        int[] reversedArray = new int[array.length];
        int indexCounter = array.length-1;

        for (int i = 0; i < array.length; i++) {
            reversedArray[indexCounter] = array[i];
            indexCounter--;
        }

        return reversedArray;
    }
}
