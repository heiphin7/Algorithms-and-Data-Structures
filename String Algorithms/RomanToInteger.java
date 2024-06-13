public class RomanToInteger {

    /*
        by @heiphin7

        Алгоритм, который переводит римские числа в обычные.
    */

    public static int romanToInteger(String string) {
        int value = 0;

        for (char c: string.toCharArray()) {
            value += getValue(c);
        }

        return value;
    }

    static int getValue(char c) {
        if (c == 'I') {
            return 1;
        } else if (c == 'V') {
            return 5;
        } else if (c == 'X') {
            return 10;
        } else if (c == 'L') {
            return 50;
        } else if (c == 'C') {
            return 100;
        } else if (c == 'D') {
            return 500;
        } else {
            return 1000;
        }
    }
}


