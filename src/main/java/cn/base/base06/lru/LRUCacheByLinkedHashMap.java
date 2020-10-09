package cn.base.base06.lru;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCacheByLinkedHashMap<K, V> {
    private int capacity;
    private LinkedHashMap<K, V> cache;

    public LRUCacheByLinkedHashMap(int size) {
        cache = new LinkedHashMap<K, V>(size);
        capacity = size;
    }

    public void insert(K key, V value) {
        if (cache.containsKey(key)) {
            cache.remove(key);
        } else if (cache.size() == capacity) {
            Iterator<Map.Entry<K, V>> iterator = cache.entrySet().iterator();
            iterator.next();
            iterator.remove();
        }
        cache.put(key, value);
    }

    public V get(K key) {
        insert(key, null);
        return null;
    }

    public void show() {
        for (K key : cache.keySet()) {
            System.out.print(key + "  ");
        }
        System.out.println();
    }
}
