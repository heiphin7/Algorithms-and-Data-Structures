package JavaSolutions;

import java.util.*;

public class C4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        TreeMap<String, Integer> map = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();

            if (map.containsKey(input)) {
                Integer count = map.get(input);
                map.put(input, count + 1);
                System.out.println(input + ((int) count+1));
            } else {
                map.put(input, 0);
                System.out.println("OK");
            }
        }
    }
}
