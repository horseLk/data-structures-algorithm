package cn.base.base07;

/**
 * 求链表的中间节点
 */
public class FindMid {
    public ListNode findMid(ListNode head) {
        if (head == null) return null;
        if (head.next == null) return head;
        ListNode slowPre = head;
        ListNode slow = head.next;
        ListNode fast = head.next.next;
        while (fast != null && fast.next != null) {
            slowPre = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        if (fast == null) {
            return slowPre;
        }
        return slow;
    }
}
