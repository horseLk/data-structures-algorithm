package cn.base.base08;

import java.util.NoSuchElementException;

public class StackByLinkedList {
    static class Node {
        public int val;
        public Node next;

        public Node(){}

        public Node(int val) {
            this.val = val;
        }
    }
    private int size;
    private Node head;

    public StackByLinkedList() {
        head = new Node();
        size = 0;
    }

    public boolean push(int x) {
        Node newNode = new Node(x);
        newNode.next = head.next;
        head.next = newNode;
        size++;
        return true;
    }

    public int pop() {
        if (size <= 0) throw new NoSuchElementException();
        Node node = head.next;
        head.next = node.next;
        return node.val;
    }

    public int size() {
        return size;
    }

}
