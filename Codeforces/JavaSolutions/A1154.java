package JavaSolutions;

import java.util.Arrays;
import java.util.Scanner;

public class A1154 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = new int[4];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        Arrays.sort(arr);

        for(int i = 0; i < arr.length - 1; i++) {
            System.out.println(Math.abs(arr[i] - arr[arr.length-1]));
        }
    }
}
