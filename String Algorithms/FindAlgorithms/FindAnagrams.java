package FindAlgorithms;

import java.util.Arrays;

public class FindAnagrams {

    /*
        by @heiphin7
        anagram check algorithm
    */

    public static boolean checkAnagrams(String s1, String s2) {
        // strings to char array
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

        // sort char arrays
        Arrays.sort(c1);
        Arrays.sort(c2);

        return new String(c1).equals(new String(c2));
    }
}
