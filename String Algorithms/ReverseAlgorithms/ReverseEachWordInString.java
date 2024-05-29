package ReverseAlgorithms;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseEachWordInString {

    /*
        by @heiphin7

        Данная функция более сложная чем другие в reverse. Он берет строку, которая состоит из нескольких слов
        а затем возвращает строку, где каждое слово было "перевернуто", то есть в обратном порядке
    */

    public static String reverseEachWordInString(String string) {
        // Проверяем, получили ли мы строку с более чем 1 словом
        if (string.split("\\s+").length < 1) {
            return string;
        }

        String[] wordsInString = string.split("\\s+");
        String[] replacedString = new String[wordsInString.length];
        int counter = 0;

        for (String word: wordsInString) {
            StringBuilder reversedString = new StringBuilder();

            for(int i = word.length() - 1; i >= 0; i--) {
                reversedString.append(word.charAt(i));
            }

            String reversed = reversedString.toString();
            replacedString[counter] = reversed;
            counter++;
        }

        return Arrays.toString(replacedString);
    }
}
