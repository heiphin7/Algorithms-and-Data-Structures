package PalindromeAlgorithms;

public class CheckPalindrome {

    /*
        by @heiphin7

        Палиндром - массив это такой массив, ко

    */

    public static boolean isPalindrome(int[] array) {
        if(array.length < 2) {
            return true;
        }

        int counter = array.length - 1;
        for (int i = 0; i < array.length / 2; i++) {
            if(array[i] != array[counter-i]) {
                return false;
            }
        }

        return true;
    }
}
