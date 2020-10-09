package cn.base.base07;

/**
 * 合并两个有序链表
 */

public class MergeLinkedList {
    /**
     * 迭代实现，将head2的数据合并到head1上
     * @param head1
     * @param head2
     * @return
     */
    public ListNode merge(ListNode head1, ListNode head2) {
        if (head1 == null) return head2;
        if (head2 == null) return head1;

        // 哨兵节点
        ListNode pre = new ListNode();
        pre.next = head1;
        ListNode p = head1;
        while (p != null && head2 != null) {
            if (p.val < head2.val) {
                pre = p;
                p = p.next;
            } else {
                ListNode tmp = head2.next;
                head2.next = p;
                pre.next = head2;
                head2 = tmp;
                pre = pre.next;
                if (p == head1) {
                    head1 = pre;
                }
            }
        }
        if (p == null) {
            pre.next = head2;
        }
        return head1;
    }

    /**
     * 递归实现
     * @param head1
     * @param head2
     * @return
     */
    public ListNode mergeRe(ListNode head1, ListNode head2) {
        if (head1 == null) return head2;
        if (head2 == null) return head1;

        if (head1.val < head2.val) {
            head1.next = mergeRe(head1.next, head2);
            return head1;
        } else {
            head2.next = mergeRe(head1, head2.next);
            return head2;
        }
    }
}
