package cn.base.base07;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(){}

    public ListNode(int v) {
        this.val = v;
    }

    public void show() {
        ListNode cur = this;
        while (cur != null) {
            System.out.print(cur.val+ "  ");
            cur = cur.next;
        }
        System.out.println();
    }
}
