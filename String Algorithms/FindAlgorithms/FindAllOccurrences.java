package FindAlgorithms;

public class FindAllOccurrences {

    /**/

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
