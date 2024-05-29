package ShiftingAlgorithms;

public class ShiftToLeft {

    /*
        by @heiphin7
        Простой алгоритм, которые делает 1 сдвиг влево для строки
    */

    public static String shiftToLeft(String wordToShift) {
        // Если даная пустая строка или же строка с 1 символом, просто возвращаем исхоную строку
        if (wordToShift.length() < 2) {
            return wordToShift;
        }

        // Используем StringBuilder, так как она будет эффективнее чем просто Строка
        StringBuilder shiftedString = new StringBuilder();

        for (int i = 1; i < wordToShift.length(); i++) {
            // Первый элемент уходит в конец, так как идет сдвижение влево
            shiftedString.append(wordToShift.charAt(i));

        }

        // Последний элемент в новой строке - первый в исходной
        shiftedString.append(wordToShift.charAt(0));

        return shiftedString.toString();
    }
}
