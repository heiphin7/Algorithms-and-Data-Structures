package JavaSolutions;

import java.util.Scanner;

public class A381 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        int fsum = 0;
        int ssum = 0;

        int left = 0;
        int right = arr.length - 1;

        for (int i = 0; i < arr.length; i++) {
            int current = 0;

            if (arr[left] > arr[right]) {
                current = arr[left];
                left++;
            } else {
                current = arr[right];
                right--;
            }

            if (i % 2 == 0) {
                fsum += current;
            } else {
                ssum += current;
            }
        }

        System.out.println(fsum + " " + ssum);
    }
}
