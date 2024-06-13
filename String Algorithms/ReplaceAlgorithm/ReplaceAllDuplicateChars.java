package ReplaceAlgorithm;

import java.util.HashSet;

public class ReplaceAllDuplicateChars {

    /*

    */

    public static String replaceAllDuplicateChars(String string) {
        char[] charsInString = string.toCharArray();
        HashSet<Character> set = new HashSet<>();

        for (char c: charsInString) {
            set.add(c);
        }

        StringBuilder stringBuilder = new StringBuilder();

        for (Character c: set) {
            stringBuilder.append(c);
        }

        return stringBuilder.toString();
    }
}
