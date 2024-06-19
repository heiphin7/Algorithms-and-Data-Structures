package BasicProblems;

import java.util.Scanner;

public class LongestIncreasingSubsequence {

    /*
        by @heiphin7



    */

    public static int findLengthOfLIS(int[] nums) {
        if (nums.length < 2) return nums.length;

        int maxLength = 1;
        int currentLength = 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i + 1] > nums[i]) {
                currentLength++;
            } else {
                currentLength = 1;
            }

            if (currentLength > maxLength) {
                maxLength = currentLength;
            }
        }

        return maxLength;
    }

    public static void solve() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n == 1) System.out.println(0);

        for (int i = 0; i < n; i++) {
            if (n < Math.pow(2, i)) {
                System.out.println(i);
                break;
            }
        }
    }

    public static void main(String[] args) {
        solve();
    }
}