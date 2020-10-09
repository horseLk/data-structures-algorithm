package cn.base.base08;

import java.util.Arrays;
import java.util.NoSuchElementException;

/**
 * 数组实现的栈
 */
public class StackByArray {
    private int top;
    private int[] data;
    private int capacity;

    public StackByArray() {
        this(16);
    }

    public StackByArray(int size) {
        this.capacity = size;
        this.data = new int[size];
        this.top = 0;
    }

    public boolean push(int x) {
        if (top == capacity) {
            resize(capacity * 2 + 1);
        }
        data[top++] = x;
        return true;
    }

    public int pop() {
        if (top == 0) throw new NoSuchElementException();
        return data[--top];
    }

    public void show() {
        for (int i = 0; i < top; i++) {
            System.out.print(data[i] + "  ");
        }
        System.out.println();
    }

    private void resize(int newSize) {
        this.capacity = newSize;
        int[] old = this.data;
        this.data = new int[newSize];
        for (int i = 0; i < old.length; i++) {
            data[i] = old[i];
        }
        top = old.length;
    }
}
