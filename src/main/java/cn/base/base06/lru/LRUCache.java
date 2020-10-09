package cn.base.base06.lru;

import java.util.NoSuchElementException;

/**
 * 使用单链表全部纯手工实现LRUCache
 */
public class LRUCache<T> {
    static class Node<T> {
        public T val;
        public Node<T> next;

        public Node(){}

        public Node(T v) {
            this(v, null);
        }

        public Node(T v, Node<T> node) {
            this.val = v;
            this.next = node;
        }
    }

    static class MyLinkedList<T> {
        public Node<T> head = new Node<T>();;
        public int size;

        public MyLinkedList(Node<T> node) {
            head.next = node;
            while (node != null) {
                size++;
                node = node.next;
            }
        }

        public MyLinkedList() {
            this(null);
        }

        public boolean contains(T x) {
            if (size == 0) return false;
            Node<T> node = head.next;
            while (node != null) {
                if (node.val.equals(x)) {
                    return true;
                }
                node = node.next;
            }
            return false;
        }

        public void remove(int index) {
            if (index >= size) throw new IllegalArgumentException();
            int count = 0;
            Node<T> node = head;
            while (count < index) {
                node = node.next;
                count++;
            }
            node.next = node.next.next;
            size--;
        }

        public void remove(T x) {
            Node<T> pre = findEle(x);
            pre.next = pre.next.next;
            size--;
        }

        public void insert(T x) {
            Node<T> newNode = new Node<T>(x, null);
            insert(0, newNode);
        }

        private void insert(int index, Node<T> node) {
            if (index > size) throw new IllegalArgumentException();
            Node<T> preNode = head;
            int i = 0;
            while (i < index) {
                preNode = preNode.next;
            }
            node.next = preNode.next;
            preNode.next = node;
            size++;
        }

        private Node<T> findEle(T x) {
            if (!contains(x)) throw new NoSuchElementException();
            Node<T> node = head;
            while (node.next != null) {
                if (node.next.val.equals(x)) {
                    return node;
                }
                node = node.next;
            }
            return null;
        }

        public void show() {
            Node<T> node = head.next;
            while (node != null) {
                System.out.print(node.val + "  ");
                node = node.next;
            }
            System.out.println();
        }
    }

    private int capacity; // 缓存空间大小
    private MyLinkedList<T> linkedList; // 缓存空间

    public LRUCache() {
        this(16);
    }

    public LRUCache(int size) {
        this.capacity = size;
        this.linkedList = new MyLinkedList<T>();
    }

    public void insert(T x) {
        if (linkedList.contains(x)) {
            linkedList.remove(x);
            linkedList.insert(x);
        } else {
            if (linkedList.size == capacity) {
                linkedList.remove(capacity - 1); // 移除最后一个元素
                linkedList.insert(x); // 头插法插入
            } else {
                linkedList.insert(x);
            }
        }
    }

    public T get(T x) {
        insert(x);
        return x;
    }

    public void show() {
        linkedList.show();
    }
}
