package FindAlgorithms;

public class FindAllOccurrences {

    /*
        by @heiphin7
        Этот алгоритм очень похож на FindSubstring, только он теперь не ищет
        целое вхождение в строку, а количество вхождений, что немаловажно.

        Мы проходимся по циклу, который идет до string.length() - substring.length(),
        так как при каждом цикле мы сравниваем подстроку, равной длине данной подстроки, довольно легко:)
    */

    public static int findOccurrencesCount(String string, String substring) {
        int countOfOccurrences = 0;

        for (int i = 0; i <= string.length() - substring.length(); i++) {
            if (string.substring(i, i + substring.length()).equals(substring)) {
                countOfOccurrences++;
            }
        }

        return countOfOccurrences;
    }

    public static void main(String[] args) {
        System.out.println(findOccurrencesCount("asdasdasdasd", "asd"));
    }
}
