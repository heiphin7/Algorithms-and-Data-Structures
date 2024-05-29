package ShiftingAlgorithms;

public class ShiftToRight {

    /*
        by @heiphin7
        Простой алгоритм для сдвига строки вправо
    */

    public static String shiftToRight(String wordToShift) {
        if(wordToShift.length() < 2) {
            return wordToShift;
        }

        StringBuilder shiftedString = new StringBuilder();

        // Перед циклом добавляем последний элемент в строке, так как при сдвиге последний элемент уходит вначало
        shiftedString.append(wordToShift.charAt(wordToShift.length()-1));

        // Цикл идет wordToShift.length() - 1, так как последний элемент мы уже добавили
        for (int i = 0; i < wordToShift.length() - 1; i++) {
            shiftedString.append(wordToShift.charAt(i));
        }

        return shiftedString.toString();
    }
}
