package JavaSolutions;

import java.util.Arrays;
import java.util.Scanner;

public class A1339 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        for(int i = 0; i < t; i++) {
            int n = s.nextInt();
            int[] arr = new int[n];

            for(int j = 0; j < n; j++) {
                arr[j] = s.nextInt();
            }

            if (n == 1) {
                System.out.println("YES");
                continue;
            }

            Arrays.sort(arr);
            boolean answer = true;

            for(int j = 0; j < arr.length - 1; j++) {
                if (Math.abs(arr[j] - arr[j+1]) > 1) {
                    answer = false;
                    break;
                }
            }

            if (answer) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
