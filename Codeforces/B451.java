import java.util.Arrays;
import java.util.Scanner;

public class B451 {
    public static void main(String[] args) {
        // Right answer, but O(n^3)
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        if (n == 1) {
            System.out.println("yes");
            System.out.println("1 1");
            return;
        }

        // Прежде чем начинать все итерации, мы проверяем, отсортирован ли массив заранее
        if (isSorted(arr, 0, 0)) {
            System.out.println("yes");
            System.out.println("1 1");
            return;
        }

        for (int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                if (isSorted(arr, i, j)) {
                    System.out.println("yes");
                    System.out.println(++i + " " + ++j);
                    return;
                }
            }
        }

        System.out.println("no");
    }

    public static boolean isSorted(int[] arr, int start, int end) {
        // Мы делаем копию массива, так как исходный массив трогать нельзя
        int[] arr2 = Arrays.copyOf(arr, arr.length);

        // swap
        while (start < end) {
            int temp = arr2[start];
            arr2[start] = arr2[end];
            arr2[end] = temp;
            start++;
            end--;
        }

        // check array is sorted?
        for(int i = 0; i < arr2.length - 1; i++) {
            if (arr2[i] > arr2[i+1]) {
                return false;
            }
        }

        return true;
    }
}
