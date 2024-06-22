package JavaSolutions;

import java.util.Arrays;
import java.util.Scanner;

/*
    by @heiphin7
*/

public class A318 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long k = scanner.nextLong();

        if (k == 1) {
            System.out.println(1);
            return;
        }

        if (n % 2 == 0) {
            if (k == n/2) {
                System.out.println(n-1);
            } else if (k < n/2) {
                System.out.println((k * 2) - 1);
            } else {
                System.out.println((k - n/2) *2);
            }
        } else {
            if (k == n/2 + 1) {
                System.out.println(n);
            } else if (k < n/2 + 1) {
                System.out.println((k*2) - 1);
            } else {
                System.out.println((k - (n/2 + 1)) * 2);
            }
        }
    }
}
