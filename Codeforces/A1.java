import java.util.Scanner;

/*
    by @heiphin7
*/


public class A1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long m = scanner.nextLong();
        long a = scanner.nextLong();

        long flagstonesLength = (n + a - 1) / a;
        long flagstonesWidth = (m + a - 1) / a;

        long totalFlagstones = flagstonesLength * flagstonesWidth;

        System.out.println(totalFlagstones);
    }
}
