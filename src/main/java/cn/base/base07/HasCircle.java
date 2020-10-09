package cn.base.base07;

public class HasCircle {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null){
            return false;
        }
        // 要避免两者一开始就出现相等
        ListNode slow = head.next;
        ListNode fast = head.next.next;

        while (slow != fast){
            if(fast == null || fast.next == null){
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
}
