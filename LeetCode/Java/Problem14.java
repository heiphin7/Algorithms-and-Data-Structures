package Java;

import java.util.Arrays;

public class Problem14 {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder answer = new StringBuilder();
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length-1];

        for(int i = 0; i < first.length(); i++) {
            if (first.charAt(i) != last.charAt(i)) {
                return answer.toString();
            }
            answer.append(first.charAt(i));
        }

        return answer.toString();
    }
}
