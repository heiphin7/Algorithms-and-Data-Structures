package JavaSolutions;

import java.util.Scanner;

public class A313 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n > 0) {
            System.out.println(n);
        } else {
            String s = String.valueOf(n);
            int last = Integer.parseInt(String.valueOf(s.charAt(s.length() - 1)));
            int secondLast = Integer.parseInt(String.valueOf(s.charAt(s.length() - 2)));

            if (last > secondLast) {
                System.out.println(s.substring(0, s.length() - 1));
            } else {
                String answer = "";

                for(int i = 0; i < s.length(); i++) {
                    if (i != s.length() - 2) {
                        answer += s.charAt(i);
                    }
                }

                if (answer.equals("-0")) {
                    System.out.println(0);
                } else {
                    System.out.println(answer);
                }
            }
        }
    }
}
