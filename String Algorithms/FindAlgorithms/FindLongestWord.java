package FindAlgorithms;

public class FindLongestWord {

    /*
        by @heiphin

        Алгоритм для поиска самого длинного слова в строке.
        Реализован достаточно прост, так как выполняется за O(N), то есть
        поиск проходит "в лоб"
    */

    public static String findLongestWord(String string) {
        String[] words = string.split(" ");

        // Если строка состоит всего из 1 слова, тогда просто возвращаем его
        if (words.length == 1) {
            return words[0];
        }

        // По умолчанию самым длинным словом будет - первое
        int maxLength = words[0].length();
        int indexOfMax = 0;

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > maxLength) {
                maxLength = words[i].length();
                indexOfMax = i;
            }
        }

        return words[indexOfMax];
    }

}
