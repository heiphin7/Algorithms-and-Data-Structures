package JavaSolutions;

import java.util.Scanner;

public class B158 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[5];

        for(int i = 0; i < n; i++) {
            arr[sc.nextInt()]++;
        }

        int answer = 0;

        // Сразу же добавляем количество групп из 4 человек
        // Так как каждому из таких групп отдельное такси нужно
        answer += arr[4];

        if (arr[1] > 0 && arr[3] > 0) {
            while (arr[1] > 0 && arr[3] > 0) {
                answer++;
                arr[1]--;
                arr[3]--;
            }
        }

        // Если нету групп из 1 человек, но есть из 3
        answer += arr[3];

        // Для групп из 2 человек
        answer += arr[2] / 2;
        arr[2] %= 2;

        if (arr[2] > 0) {  // Если осталась одна группа из двух человек
            if (arr[1] > 1) {  // Если есть хотя бы две группы по одному человеку
                answer++;  // Добавляем одно такси для группы из двух человек и двух групп по одному человеку
                arr[1] -= 2;
            } else {
                answer++;
                arr[1] = 0;
            }
        }

        // Оставшиеся группы из 1 человека
        if (arr[1] > 0) {
            answer += (arr[1] + 3) / 4;
        }

        System.out.println(answer);
    }
}
