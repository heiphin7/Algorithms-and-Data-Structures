package JavaSolutions;

import java.util.Arrays;
import java.util.Scanner;

/*
    by @heiphin7
*/


public class A479 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // Для решения этой задачи мы просто перебираем все варианты
        System.out.println(
                Math.max(
                        Math.max((a*b*c),(a+b+c)),
                        Math.max((a * (b+c)), ((a+b) * c))
                )
        );
    }
}
