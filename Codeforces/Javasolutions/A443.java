package JavaSolutions;

import java.util.HashSet;
import java.util.Scanner;

public class A443 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String letters = scanner.nextLine();

        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < letters.length(); i++) {
            char curr = letters.charAt(i);
            if (curr != ' ' && curr != '}' && curr != '{' && curr != ',') {
                set.add(curr);
            }
        }

        System.out.println(set.size());
    }
}
