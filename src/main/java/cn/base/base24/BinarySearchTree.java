package cn.base.base24;

import java.util.NoSuchElementException;

public class BinarySearchTree {
    static class Node {
        int val;
        Node left;
        Node right;

        public Node(int _v) {
            this.val = _v;
        }
    }

    private Node root;

    public Node find (int x) {
        return find(x, root);
    }

    public boolean insert(int x) {
        if (find(x) != null)
            return false;
        root = insert(x, root);
        return true;
    }

    public void remove(int x) {
        root = remove(x, root);
    }

    public int findMin() {
        if (root == null) throw new NoSuchElementException();
        return findMin(root).val;
    }

    public int findMax() {
        if (root == null) throw new NoSuchElementException();
        return findMax(root).val;
    }

    public Node findNext(Node node) {
        Node next = findMin(node.right);
        Node parent = findParent(root, node);
        while (next != null && parent != null) {
            next = findMin(parent.right);
            parent = findParent(root, parent);
        }
        return next;
    }

    public Node findPre(Node node) {
        if (node == root) return null;
        Node pre = findMax(node.left);
        if (pre != null) return pre;
        return findParent(root, node);
    }

    private Node findParent(Node node, Node cur) {
        if (cur == root) return null;
        if (cur.val < node.val) {
            if (node.left == cur) return node;
            return findParent(node.left, cur);
        } else {
            if (node.right == cur) return node;
            return findParent(node.right, cur);
        }
    }

    private Node findMin(Node node) {
        if (node == null) return null;
        Node p = node;
        while (p.left != null) {
            p = p.left;
        }
        return p;
    }

    public Node findMax(Node node) {
        if (node == null) return null;
        if (node.right == null) return node;
        return findMax(node.right);
    }

    private Node remove(int x, Node node) {
        if (node == null) return null;
        if (node.left == null && node.right == null) return null;
        if (node.val == x) {
            if (node.left != null && node.right != null) {
                int tmp = findMin(node.right).val;
                node.val = tmp;
                node.right = remove(tmp, node.right);
            } else {
                node = node.left == null ? node.right : node.left;
            }
        } else if (node.val < x) {
            node.right = remove(x, node.right);
        } else {
            node.left = remove(x, node.left);
        }
        return node;
    }

    private Node insert(int x, Node node) {
        if (node == null) {
            Node newNode = new Node(x);
            return newNode;
        }
        if (node.val < x) {
            node.right = insert(x, node.right);
        } else {
            node.left = insert(x, node.left);
        }
        return node;
    }

    private Node find(int x, Node node) {
        if (node == null) return null;
        if (node.val == x) return node;
        else if (node.val > x) return find(x, node.left);
        else return find(x, node.right);
    }
}
