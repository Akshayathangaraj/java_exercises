import java.util.*;

class Substring {
    public static int findSubstring(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();

        if (m == 0) return 0; 
        if (m > n) return -1;  
        for (int i = 0; i <= n - m; i++) {
            int j = 0;
            while (j < m && s1.charAt(i + j) == s2.charAt(j)) {
                j++;
            }
            if (j == m) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String str1=sc.nextLine();
        System.out.println(findSubstring(str,str1));
    }
}