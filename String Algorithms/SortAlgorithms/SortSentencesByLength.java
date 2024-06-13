package SortAlgorithms;

import java.util.Arrays;

public class SortSentencesByLength {

    /*
        by @heiphin7
        Сортировка строки по длине слов. Я использовал сортировку пузырьком
        для сортировки по длине слов.
    */

    public static String sortSentencesByLenght(String string) {
        String[] words = string.split(" "); // Разбиваем строку на слова

        // Если у нас строка всего с 1 словом, или даже меньше, просто возвращаем то же слово
        if (words.length < 2) {
            return Arrays.toString(words);
        }

        boolean isSorted;

        for (int i = 0; i < words.length; i++) {
            isSorted = false;

            for (int j = 0; j < words.length - 1; j++) {
                if (words[j].length() > words[j+1].length()) {
                    isSorted = true;
                    String temp = words[j];
                    words[j] = words[j+1];
                    words[j+1] = temp;
                }
            }

            if(!isSorted) {
                return Arrays.toString(words);
            }
        }


        return Arrays.toString(words);
    }
}
