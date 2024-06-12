package FindAlgorithms;

import java.util.HashMap;
import java.util.Map;

public class FindMostFrequentChar {

    /*
        by @heiphin7

        Алгоритм для поиска самого частого символа в строке.
        Довольно сложный для понимания, поэтому вот простое объяснение:

            Сначала мы создаём HashMap<Character, Integer>, где ключ - символ, Integer - количество вхождений в строку
            Далее проходимся по циклу и "кладем" символ в map если его нету, а если он уже присутсвует, тогда увеличиваем
            его количество вхождений.

            Далее, после того как мы заполнили map, проходимся по нему и ищем
            элемент с наибольшим количеством значений, и после того как мы нашли такого, возвращаем ключ элемента

            В противном случае, алгоритм возвращает просто точку
    */

    public static char findMostFrequentChar(String string) {
        // if single char, just return him
        if (string.length() == 1) {
            return string.charAt(0);
        }

        int maxNumbers = 0;

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < string.length(); i++) {
            boolean isExists = map.containsKey(string.charAt(i));

            if(!isExists) {
                map.put(string.charAt(i), 1);
            }

            map.put(string.charAt(i), map.get(string.charAt(i)) + 1);

            if (maxNumbers < map.get(string.charAt(i))) {
                maxNumbers = map.get(string.charAt(i));
            }
        }

        // find Char with value
        for (Map.Entry<Character, Integer> enty: map.entrySet()) {
            if (maxNumbers == enty.getValue()) {
                return enty.getKey();
            }
        }

        return '.';
    }
}
