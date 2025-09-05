import java.util.*;

public class Mergearray {
    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int i = 0, j = 0;
        List<Integer> merged = new ArrayList<>();
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                addIfNotPresent(merged, arr1[i++]);
            } else if (arr1[i] > arr2[j]) {
                addIfNotPresent(merged, arr2[j++]);
            } else {
                addIfNotPresent(merged, arr1[i]);
                i++; j++;
            }
        }
        while (i < arr1.length) addIfNotPresent(merged, arr1[i++]);
        while (j < arr2.length) addIfNotPresent(merged, arr2[j++]);
        return merged.stream().mapToInt(x -> x).toArray();
    }

    private static void addIfNotPresent(List<Integer> list, int val) {
        if (list.isEmpty() || list.get(list.size()-1) != val) {
            list.add(val);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) arr1[i] = sc.nextInt();
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) arr2[i] = sc.nextInt();
        int[] merged = mergeArrays(arr1, arr2);
        for (int x : merged) System.out.print(x + " ");
    }
}
