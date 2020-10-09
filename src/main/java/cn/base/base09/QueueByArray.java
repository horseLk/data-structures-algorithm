package cn.base.base09;

import java.util.NoSuchElementException;

public class QueueByArray {
    private int head;
    private int tail;
    private int[] data;

    public QueueByArray() {
        this(16);
    }

    public QueueByArray(int size) {
        this.head = 0;
        this.tail = 0;
        this.data = new int[size];
    }

    public boolean enqueue(int x) {
        if (tail == data.length) {
            if (tail - head < data.length) {
                for (int i = head; i < tail; i++) {
                    data[i - head] = data[i];
                }
                tail -= head;
            } else {
                return false;
            }
        }
        data[tail++] = x;
        return true;
    }

    public int dequeue() {
        if (tail == head) throw new NoSuchElementException();
        return data[head++];
    }
}
