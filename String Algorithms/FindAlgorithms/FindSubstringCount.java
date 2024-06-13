package FindAlgorithms;

public class FindSubstringCount {

    /*
        by @heiphin7

        Алгоритм, который считает количество вхождений подстроки в строку.
    */

    public static int substringCount(String string, String substring) {
        int substringCount = 0;

        for (int i = 0; i <= string.length() - substring.length(); i++) {
            if (string.substring(i, i + substring.length()).equals(substring)) {
                substringCount++;
            }
        }

        return substringCount;
    }
}
