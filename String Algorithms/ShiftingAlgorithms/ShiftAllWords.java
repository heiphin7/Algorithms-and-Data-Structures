package ShiftingAlgorithms;

import java.util.Arrays;

public class ShiftAllWords {

    /*
        by @heiphin7

        Данная функция - это алгоритм, которые выполняет сдвиги для строк, состоящих из слов.
        Она принимает строку и тип сдвига, далее просто делает выбранный сдвиг, используя простой алгоритм
    */

    public static String shiftAllWords(String words, String typeOfShifting) {
        // Проверяем тип сдвига на правильность
        if (!typeOfShifting.equals("right") && !typeOfShifting.equals("left")) {
            return "Wrong type of shifting choose right(left, right)";
        }

        // Проверяем, состоит ли строка более чем из 2 слов
        if(words.split("\\s+").length < 2) {
            return words;
        }

        // Разделяем строку на массив строк для дальнейшего переставления
        String[] wordsInString = words.split(" ");

        // Если все нормально, и строка состоит из нескольких слов, тогда мы можем начинать перестановки
        String[] replacedWords = new String[wordsInString.length];

        if (typeOfShifting.equals("left")) {
            int counter = 0;
            replacedWords[replacedWords.length-1] = wordsInString[0];

            for (int i = 0; i < wordsInString.length - 1; i++) {
                // С учетом всех перестановок, в новом массиве будут следующие индексы
                replacedWords[counter] = wordsInString[i + 1];
                counter++;
            }

            return Arrays.toString(replacedWords);
        } else {
            replacedWords[0] = wordsInString[wordsInString.length-1];

            for (int i = 1; i < wordsInString.length; i++) {
                replacedWords[i] = wordsInString[i - 1];
            }

            return Arrays.toString(replacedWords);
        }
    }
}
