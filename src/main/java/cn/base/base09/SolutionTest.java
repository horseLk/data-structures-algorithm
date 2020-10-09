package cn.base.base09;

public class SolutionTest {
    public static void main(String[] args) {
        QueueByArray queue = new QueueByArray(4);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        queue.enqueue(8);

        QueueByLinkedList queue2 = new QueueByLinkedList();
        queue2.enqueue(3);
        queue2.enqueue(5);
        queue2.enqueue(6);
        queue2.enqueue(1);
        System.out.println(queue2.dequeue());
        System.out.println(queue2.dequeue());
        System.out.println(queue2.dequeue());
        queue2.enqueue(7);
        queue2.enqueue(8);

        CycleQueue queue3 = new CycleQueue(5);
        queue3.enqueue(5);
        queue3.enqueue(4);
        queue3.enqueue(3);
        queue3.enqueue(2);
        queue3.enqueue(1);
        queue3.enqueue(0);
        System.out.println(queue3.dequeue());
        System.out.println(queue3.dequeue());
        queue3.enqueue(9);
    }
}
