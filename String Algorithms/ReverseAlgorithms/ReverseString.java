package ReverseAlgorithms;

public class ReverseString {

    /*
        by @heiphin7

        ReverseString - простой алгоритм для "переворачивания" строки
    */

    public static String reverse(String string) {
        StringBuilder reversedString = new StringBuilder();

        for(int i = string.length() - 1; i >= 0; i--) {
            reversedString.append(string.charAt(i));
        }

        return reversedString.toString();
    }
}
