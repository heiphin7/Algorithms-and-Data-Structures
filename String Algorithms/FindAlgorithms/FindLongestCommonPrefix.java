package FindAlgorithms;

import java.util.Arrays;

public class FindLongestCommonPrefix {

    /*
        by @heiphin7


    */

    public static String findLongestCommonPrefix(String[] words) {
        if (words.length == 0) {
            return "";
        }
        if (words.length == 1) {
            return words[0];
        }

        Arrays.sort(words);

        int lastIndex = Math.min(words[0].length(), words[words.length-1].length());

        int lengthOfPrefix = 0;

        while(lengthOfPrefix < lastIndex &&
                words[0].charAt(lengthOfPrefix) == words[words.length-1].charAt(lengthOfPrefix)) {
            lengthOfPrefix++;
        }

        return words[0].substring(0, lengthOfPrefix);
    }
}
