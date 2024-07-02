package JavaSolutions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class B977 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String s = scanner.nextLine();

        Map<String, Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;


        for(int i = 0; i < n - 1; i++) {
            String current = s.substring(i, i + 2);
            Integer count = map.get(current);

            if (count == null) {
                map.put(current, 1);
                continue;
            }

            map.put(current, count + 1);

            if (max < count + 1) {
                max = count + 1;
            }
        }

        boolean founded = false;

        for(Map.Entry<String, Integer> entry: map.entrySet()) {
            if (entry.getValue() == max) {
                System.out.println(entry.getKey());
                founded = true;
                return;
            }
        }

        // if not founded
        if(!founded) {
            System.out.println(s.substring(0, 2));
        }
    }
}
