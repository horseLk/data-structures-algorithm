package cn.base.base28;

import java.util.NoSuchElementException;

public class Heap {
    private int[] data;
    private int size; // 实际数据个数
    private int capacity; // 数组容量

    public Heap(int capacity) {
        data = new int[capacity + 1]; // 索引 0 处不存储数据
        this.capacity = capacity;
        size = 0;
    }

    public void insert(int x) {
        if (size == capacity) return;
        data[++size] = x;
        up(size);
    }

    public int delete() {
        if (size == 0) throw new NoSuchElementException();
        int val = data[1];
        data[1] = data[size--];
        down(1);
        return val;
    }

    public void sort() {
        int count = size;
        while (size > 0) {
            int val = data[1];
            data[1] = data[size];
            data[size--] = val;
            down(1);
        }
        for (int i = 1; i <= count; i++) {
            System.out.print(data[i] + " ");
        }
    }

    private void down(int i) {
        int child = i * 2;
        while (child <= size) {
            if (child + 1 <= size && data[child + 1] < data[child]) {
                child += 1;
            }
            if (data[i] > data[child]) {
                int tmp = data[child];
                data[child] = data[i];
                data[i] = tmp;
            }
            i = child;
            child *= 2;
        }
    }

    private void up(int i) {
        data[0] = data[i];
        while (data[i] < data[i / 2]) {
            int tmp = data[i];
            data[i] = data[i / 2];
            data[i / 2] = tmp;
            i = i / 2;
        }
    }
}
