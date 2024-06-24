package Java;

/*
    by @heiphin7

    28. Find the Index of the First Occurrence in a String

    �������� ��� ������, ���� � ���� ����, ������� ������ ������� ���������
    ���� � ����� ���� ��� -1, ���� ���� �� �������� ������ ����� ����.

    ����� ���� �������� ��������� �������, �� ��� ���� ��� �������� �� 10ms (� �������).
    ��, �� ������ �������� ��������� ������ �� ���������, ����� ������� ����� needle.length().
    � ����� ������ ���������� ��������� � ������ ��� �������.
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
