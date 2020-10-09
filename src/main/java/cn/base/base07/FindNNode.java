package cn.base.base07;

/**
 * 删除链表中倒数第n个节点
 */
public class FindNNode {
    /**
     * 思路：快慢指针
     *      1.快指针先走n步
     *      2.慢指针和快指针一起走，直至快指针为null
     * @param head
     * @param n
     * @return
     */
    public ListNode deleteNNode(ListNode head, int n) {
        ListNode fast = head;
        int i = 0;
        while (fast != null && i < n) {
            fast = fast.next;
            i++;
        }
        if (fast == null && i < n) {
            return null;
        }
        ListNode slow = head;
        ListNode pre = null;
        while (fast != null) {
            pre = slow;
            slow = slow.next;
            fast = fast.next;
        }
        if (slow == head) {
            head = head.next;
        } else {
            pre.next = slow.next;
        }
        return head;
    }
}
