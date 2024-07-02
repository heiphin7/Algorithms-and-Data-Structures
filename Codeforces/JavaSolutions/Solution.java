import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String s = bufferedReader.readLine();
        String[] arr = s.split(" ");

        int maxLength = Integer.MIN_VALUE;
        for(String word: arr) {
            if (word.length() > maxLength) {
                maxLength = word.length();
            }
        }
        maxLength = maxLength * 3;

        StringBuilder answer = new StringBuilder();
        int currLen = 0;

        for(int i = 0; i < arr.length; i++) {
            // Проверка, нужно ли переносить строку
            if ((currLen + arr[i].length()) > maxLength) {
                answer.append("\n");
                currLen = 0;
            }

            // Добавляем слово
            if (i != arr.length - 1) {
                answer.append(arr[i]).append(" ");
            } else {

            }

            // Обновляем текущую длину строки
            currLen += arr[i].length() + 1;
        }
        System.out.println(answer.toString());
     }
}