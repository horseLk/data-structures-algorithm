package cn.base.base28;

public class SolutionTest {
    public static void main(String[] args) {
        Heap heap = new Heap(5);
        heap.insert(7);
        heap.insert(3);
        heap.insert(2);
        heap.insert(9);
        heap.insert(5);

        heap.sort();

//        System.out.println(heap.delete());
//        System.out.println(heap.delete());
//        System.out.println(heap.delete());
    }
}
