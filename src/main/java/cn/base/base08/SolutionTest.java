package cn.base.base08;

public class SolutionTest {
    public static void main(String[] args) {
        StackByArray stack = new StackByArray(1);
        stack.push(5);
        stack.push(6);
        stack.push(1);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.push(7);
        stack.push(2);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.show();

        StackByLinkedList stack2 = new StackByLinkedList();
        stack2.push(1);
        stack2.push(2);
        stack2.push(3);
        System.out.println(stack2.pop());
        System.out.println(stack2.pop());
        stack2.push(5);
        stack2.push(4);
    }
}
