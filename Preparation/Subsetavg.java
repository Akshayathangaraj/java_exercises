import java.util.*;

public class Subsetavg {
    static double arrayAverage(int[] arr) {
        int sum = 0;
        for (int x : arr) sum += x;
        return (double) sum / arr.length;
    }

    static void findSubsets(int[] arr) {
        double avg = arrayAverage(arr);
        int n = arr.length;
        for (int mask = 1; mask < (1 << n); mask++) {
            List<Integer> subset = new ArrayList<>();
            int sum = 0, count = 0;
            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {
                    subset.add(arr[i]);
                    sum += arr[i];
                    count++;
                }
            }
            if (count > 0 && (double) sum / count == avg) {
                System.out.println(subset);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        findSubsets(arr);
    }
}
