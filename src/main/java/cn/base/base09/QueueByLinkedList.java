package cn.base.base09;

import cn.base.base08.StackByLinkedList;

import java.util.NoSuchElementException;

public class QueueByLinkedList {
    static class Node {
        public int val;
        public Node next;

        public Node(){}

        public Node(int val) {
            this.val = val;
        }
    }
    private int size;
    private Node pHead;
    private Node tail;

    public QueueByLinkedList() {
        this.size = 0;
        this.pHead = new Node();
        tail = pHead;
    }

    public boolean enqueue(int x) {
        Node node = new Node(x);
        tail.next = node;
        tail = node;
        size++;
        return true;
    }

    public int dequeue() {
        if (pHead == tail) throw new NoSuchElementException();
        Node node = pHead.next;
        pHead = pHead.next;
        size--;
        return node.val;
    }
}
