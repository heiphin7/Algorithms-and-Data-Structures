package PalindromeAlgorithms;

public class PalindromeChecker {

    /*
        by @heiphin7
        Palindrome check algorithm with O(N)
    */

    public static boolean checkPalindrome(String stringForCheck) {
        if (stringForCheck.length() < 3) {
            return false;
        }

        int left = 0;
        int right = stringForCheck.length() - 1;

        while (left < right) {
            if (stringForCheck.charAt(left) != stringForCheck.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }
        return true;
    }
}
