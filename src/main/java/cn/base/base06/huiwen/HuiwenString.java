package cn.base.base06.huiwen;

/**
 * 判断一个链表是否是回文字符串
 */
public class HuiwenString {
    public static class Node {
        public char val;
        public Node next;

        public Node(){}

        public Node(char c) {
            this.val = c;
        }
    }
    public boolean isHuiwen(Node head) {
        if (head == null || head.next == null) return true;
        Node slow = head;
        Node fast = head;
        Node slowPre = slow;
        // 找到后半部分的第一个节点
        while (fast != null && fast.next != null) {
            slowPre = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        if (fast != null) {
            slowPre = slow;
            slow = slow.next;
        }
        // 从slow开始逆序
        slowPre.next = reverse(slow);
        // 逆序后可以开始判断是否是个回文
        Node cur = slowPre.next;
        Node pre = head;
        boolean flag = true;
        while (cur != null) {
            if (pre.val != cur.val) flag =  false;
            cur = cur.next;
            pre = pre.next;
        }
        // 还原链表
        slowPre.next = reverse(slowPre.next);
        return flag;
    }

    private Node reverse(Node node) {
        Node cur = node.next;
        Node pre = node;
        while (cur != null) {
            pre.next = cur.next;
            cur.next = node;
            node = cur;
            cur = pre.next;
        }
        return node;
    }
}
