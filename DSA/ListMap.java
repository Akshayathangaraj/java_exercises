import java.util.*;

class ListMap {
    public static void main(String[] args) {
        String[] words = {"bat", "tab", "eat", "tea", "tan", "nat"};
        Map<String, List<String>> map = new HashMap<>();

        for (String w : words) {
            char[] arr = w.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);

            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(w);
        }

        System.out.println(map.values());
    }
}
