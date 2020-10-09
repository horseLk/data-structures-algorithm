package cn.base.base07;

/**
 * 反转链表
 */
public class Reverse {
    public ListNode reverse(ListNode head) {
        if (head == null) return null;
        ListNode pHead = new ListNode();
        pHead.next = head;
        while (head.next != null) {
            ListNode cur = head.next;
            head.next = cur.next;
            cur.next = pHead.next;
            pHead.next = cur;
        }
        return pHead.next;
    }
}
