import java.util.Scanner;

/*
    by @heiphin7
*/


public class A69 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] ans = new int[3];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < 3; j++) {
                ans[j] += scanner.nextInt();
            }
        }

        if (ans[0] != 0 || ans[1] != 0 || ans[2] != 0) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }


}
