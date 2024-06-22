package SortingAlgorithms;

public class BubbleSort {

    /*
        by @heiphin7

        Самая класическая и базовая реализация bubbleSort на java
    */

    public static void bubbleSort(int[] arrayToSort) {
        boolean hasSorted = true;

        while (hasSorted) {
            hasSorted = false;

            for (int i = 0; i < arrayToSort.length-1; i++) {
                if(arrayToSort[i] > arrayToSort[i+1]) {
                    hasSorted=true;
                    int temp = arrayToSort[i];
                    arrayToSort[i] = arrayToSort[i+1];
                    arrayToSort[i+1] = temp;
                }
            }
        }
    }
}
