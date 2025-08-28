import java.util.*;

class PriorityQueue {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int k = 2;

        Map<Integer, Integer> freq = new HashMap<>();
        for (int n : nums) freq.put(n, freq.getOrDefault(n, 0) + 1);

        PriorityQueue<Map.Entry<Integer, Integer>> pq =
            new PriorityQueue<>((a,b) -> b.getValue() - a.getValue());

        pq.addAll(freq.entrySet());

        List<Integer> res = new ArrayList<>();
        while (k-- > 0 && !pq.isEmpty()) {
            res.add(pq.poll().getKey());
        }

        System.out.println(res); // [1, 2]
    }
}
