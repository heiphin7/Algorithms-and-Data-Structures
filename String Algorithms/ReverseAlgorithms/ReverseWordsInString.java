package ReverseAlgorithms;

import java.util.Arrays;

public class ReverseWordsInString {

    /*
        by @heiphin7

        ReverseWordsInString - функция, которая "переворачивает" порядок слов в строке.
        Прошу не путать с тем, что он не "переворачивает" каждое слово в строке, а лишь
        меняет их местоположение в обратном порядке
    */

    public static String reverseWordsInString(String string) {
        // Если строка состоит менее чем из 2 слов, тогда просто возвращаем исходную строку
        if (string.split("\\s+").length < 2) {
            return string;
        }

        // Создаем массив строк на основе принимаемой строки
        String[] wordsInString = string.split("\\s+");
        String[] reversedString = new String[wordsInString.length];
        int counter = 0;

        // Используя цикл, заполняем второй массив
        for (int i = wordsInString.length-1; i >= 0; i--) {
            reversedString[counter] = wordsInString[i];
            counter++;
        }

        // с помощью toString обратно в строку конвентируем
        return Arrays.toString(reversedString);
    }
}
