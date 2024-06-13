package FindAlgorithms;

public class FindShortestWord {

    /*
        by @heiphin7

        Данный алгоритм позволяет найти самое короткое слово в строке,
        который состоит из нескольких слов. Если строка состоит из одного слова,
        мы просто возвращаем его же. А если все нормально и подходит под условия, тогда
        мы циклом проходимся по всем элементам и сравниваем их с длиной слова по умолчанию.

        Алгоритм работает за O(N)
    */

    public static String findShortestWord(String string) {
        String[] words = string.split(" ");

        if (words.length == 1) {
            return string;
        }

        // Определяем начальные индексы, по умолчанию самое котороткое - первое слово в строке
        int indexOfMin = 0;
        int lengthOfMin = words[0].length();

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() < lengthOfMin) {
                indexOfMin = i;
                lengthOfMin = words[i].length();
            }
        }

        return words[indexOfMin];
    }
}
