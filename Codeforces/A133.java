import java.util.Scanner;

/*
    by @heiphin7
*/


public class A133 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String code = scanner.nextLine();

        for (int i = 0; i < code.length(); i++) {
            if (code.charAt(i) == 'H' || code.charAt(i) == 'Q' || code.charAt(i) == '9') {
                System.out.println("YES");
                return;
            }
        }

        System.out.println("NO");
    }
}
