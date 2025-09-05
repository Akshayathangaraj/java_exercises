import java.util.*;
public class Numbersystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue<String> q = new LinkedList<>();
        q.add("3");
        q.add("4");
        String res="";
        for(int i=0;i<n;i++){
            res=q.poll();
            q.add(res+"3");
            q.add(res+"4");
        }
        System.out.println(res);
    }
}
