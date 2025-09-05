import java.util.*;

public class Xpattern {
    public static void printXPattern(String s) {
        int n = s.length();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == i || j == n - i - 1) System.out.print(s.charAt(j));
                else System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        printXPattern(input);
    }
}
