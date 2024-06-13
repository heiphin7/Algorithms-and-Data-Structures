package ReplaceAlgorithm;

import java.util.HashSet;

public class ReplaceAllDuplicateChars {

    /*
        by @heiphin7

        Алгоритм для удаления всех повторяющихся символов в строке.
        Здесь все просто, мы использовали HashSet, и в этот set передали
        все символы строки. Таким образом, set обеспечивает уникальность всех элементов,
        поэтому выходные данные будут верны

        Работает за O(N)
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
