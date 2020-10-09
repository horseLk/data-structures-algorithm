package cn.base.base07;

public class SolutionTest {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);
        ListNode listNode6 = new ListNode(6);

        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        listNode5.next = listNode6;

//        node1.show();
//        node1 = new Reverse().reverse(node1);
//        node1.show();
//
//        node2.show();
//        node2 = new Reverse().reverse(node2);
//        node2.show();

//        listNode6.show();
//        listNode6 = new Reverse().reverse(listNode6);
//        listNode6.show();

        // 判断有环的测试--LeetCode 141
        // 合并两个有序链表--LeetCode 21

        // 删除倒数第n个节点
//        listNode1.show();
//        ListNode listNode = new FindNNode().deleteNNode(listNode5, 4);
//        if (listNode != null) listNode.show();
        
        // 查找中间节点
        listNode1.show();
        ListNode mid = new FindMid().findMid(listNode6);
        System.out.println(mid.val);
    }
}
