import java.util.*;

class LRUCache<K, V> extends LinkedHashMap<K, V> {
    private int capacity;

    public LRUCache(int capacity) {
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }

    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > capacity;
    }
}

public class LRUCacheExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int capacity = 10;
        LRUCache<Integer, String> cache = new LRUCache<>(capacity);
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            String op = sc.next();
            if (op.equals("put")) {
                int key = sc.nextInt();
                String val = sc.next();
                cache.put(key, val);
            } else if (op.equals("get")) {
                int key = sc.nextInt();
                System.out.println(cache.getOrDefault(key, "Not Found"));
            }
        }
    }
}
