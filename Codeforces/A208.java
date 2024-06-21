import java.util.Scanner;

public class A208 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String result = s.replaceAll("WUB", " ");
        System.out.println(result);
    }
}
