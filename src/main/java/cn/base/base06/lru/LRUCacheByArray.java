package cn.base.base06.lru;

import java.util.Arrays;

public class LRUCacheByArray {
    private int curSize;
    private int[] cache;

    public LRUCacheByArray(int size) {
        cache = new int[size];
        curSize = 0;
    }

    public void get(int x) {
        int index = indexOf(x);
        if (index != -1) {
            remove(index);
        } else {
            // 从缓存的下一层缓存查找
        }
        insert(x);
    }

    public void show() {
        System.out.println(Arrays.toString(cache));
    }

    private void insert(int x) {
        if (curSize == cache.length) {
            remove(curSize - 1);
        }
        for (int i = curSize; i > 0; i--) {
            cache[i] = cache[i - 1];
        }
        cache[0] = x;
        curSize++;
    }

    private int indexOf(int x) {
        for (int i = 0; i < curSize; i++) {
            if (cache[i] == x) {
                return i;
            }
        }
        return -1;
    }

    private void remove(int index) {
        while (index < curSize - 1) {
            cache[index] = cache[index + 1];
            index++;
        }
        curSize--;
    }
}
