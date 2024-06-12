package FindAlgorithms;

public class FindSubstring {

    /*
        @heiphin7
        Более сложный алгоритм для поиска подстроки.
        Мы каждый раз проверяем подстроку для строки таким образом,
        чтобы в ходе работы не возник IndexOutOfBoudException. Алгоритм достаточно прост для понимания

        Работает за O(N)
    */

    public static boolean findSubstring(String string, String substring) {
        if(string.length() < substring.length()) {
            return false;
        }

        for (int i = 0; i <= string.length() - substring.length(); i++) {
            if (string.substring(i, i + substring.length()).equals(substring)) {
                return true;
            }
        }

        return false;
    }
}
