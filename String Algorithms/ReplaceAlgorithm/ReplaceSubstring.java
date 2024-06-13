package ReplaceAlgorithm;

public class ReplaceSubstring {

    /*
        by @heiphin7

        Удаление подстроки из строки. Данный код принимает 2 параметра:
        строку и подстроку (которую нужно удалить). Далее, для удаления мы должны
        узнать индексы (промежуток индексов) подстоки и используя новый цикл просто обходим
        данный промежуток и добавляем все в новую строку, которую возвращаем
    */

    public static String replaceSubstring(String string, String substring) {

        // Индексы для подстроки
        int startIndex = -1;
        int endIndex = -1;

        // Строка, у которой убрана подстрока
        StringBuilder stringWithoutSubstring = new StringBuilder(); // use stringbuilder for append's

        // Ищем индексы подстроки то есть вхождение подстроки в строку
        for (int i = 0; i <= string.length() - substring.length(); i++) {
            if (string.substring(i, i + substring.length()).equals(substring)) {
                startIndex = i;
                endIndex = i + substring.length()-1;

                break; // break, cause we find substring
            }
        }

        // Проверяем индексы, нашли ли подстроку для строки
        if (startIndex == -1) {
            return string;
        }

        // Далее, используя новый цикл заполняем новую строку но уже без элементов подстроки
        for (int i = 0; i < string.length(); i++) {
            if (i < startIndex || i > endIndex) {
                stringWithoutSubstring.append(string.charAt(i));
            }
        }

        return stringWithoutSubstring.toString();
    }

}
