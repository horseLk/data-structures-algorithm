package cn.base.base09;

import java.util.NoSuchElementException;

public class CycleQueue {
    private int head;
    private int tail;
    private int[] data;

    public CycleQueue() {
        this(16);
    }

    public CycleQueue(int size) {
        data = new int[size];
    }

    public boolean enqueue(int x) {
        if ((tail + 1) % data.length == head) {
            return false;
        }
        data[tail] = x;
        tail = (tail + 1) % data.length;
        return true;
    }

    public int dequeue() {
        if (head == tail) throw new NoSuchElementException();
        int value = data[head];
        head = (head + 1) % data.length;
        return value;
    }
}
