package Java;

/*
    by @heiphin7

    28. Find the Index of the First Occurrence in a String

    Учитывая две строки, игла и стог сена, верните индекс первого вхождения
    иглы в стоге сена или -1, если игла не является частью стога сена.

    Здесь идет довольно мудренное решение, но при этом она работает за 10ms (в литкоде).
    Мы, на каждой итерации разбиваем строку на подстроки, длина которых равна needle.length().
    А затем просто сравниваем подстроку с данной нам строкой.
*/


public class Problem29 {
    public int strStr(String haystack, String needle) {
        if (needle.equals(haystack)) {
            return 0;
        }

        int n = needle.length();

        if (n == 1) {
            return searchSingleChar(haystack, needle);
        }


        for(int i = 0; i <= haystack.length() - n; i++) {
            System.out.println(haystack.substring(i, i+n));
            if (haystack.substring(i, i+n).equals(needle)) {
                return i;
            }
        }

        return -1;
    }

    int searchSingleChar(String haystack, String needle) {
        for(int i = 0; i < haystack.length(); i++) {
            if (String.valueOf(haystack.charAt(i)).equals(needle)) {
                return i;
            }
        }

        return -1;
    }
}
