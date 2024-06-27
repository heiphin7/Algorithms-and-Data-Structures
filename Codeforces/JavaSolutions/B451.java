package JavaSolutions;

import java.util.Arrays;
import java.util.Scanner;

public class B451 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int l = 0, r = n - 1; // left & right pointers

        while (l < n - 1 && arr[l] <= arr[l + 1]) {
            l++;
        }

        // if l == n - 1, array is already sorted, just write answer
        if (l == n - 1) {
            System.out.println("yes");
            System.out.println("1 1");
            return;
        }

        while (r > 0 && arr[r] >= arr[r - 1]) {
            r--;
        }

        reverse(arr, l, r);

        if (isSorted(arr)) {
            System.out.println("yes");
            System.out.println(++l + " " + ++r);
        } else {
            System.out.println("no");
        }
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static boolean isSorted(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i+1]) {
                return false;
            }
        }

        return true;
    }
}
