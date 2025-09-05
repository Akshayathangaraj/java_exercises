import java.util.*;

public class Reverse {
    public static String reverseWords(String s) {
        if (!s.contains(" ")) return s;
        int idx = s.indexOf(" ");
        return reverseWords(s.substring(idx + 1)) + " " + s.substring(0, idx);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(reverseWords(input));
    }
}
