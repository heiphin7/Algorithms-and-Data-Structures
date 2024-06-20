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

        int[] arr = new int[(int) n];
        int indexOfOdd = 0;
        int indexOfEven = arr.length % 2 == 0 ? arr.length / 2: arr.length / 2 + 1;

        for (int i = 1; i <= n; i++) {

            if (i % 2 == 0) {
                arr[indexOfEven] = i;
                indexOfEven++;
            } else {
                arr[indexOfOdd] = i;
                indexOfOdd++;
            }
        }

        System.out.println(arr[(int) k - 1]);
    }
}
