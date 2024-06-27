package JavaSolutions;

import java.util.Scanner;

/*
    by @heiphin7
*/

public class B200 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double sum = 0.0;

        for(int i = 0; i < n; i++) {
            sum += scanner.nextInt();
        }

        System.out.println(sum/n);
    }
}
