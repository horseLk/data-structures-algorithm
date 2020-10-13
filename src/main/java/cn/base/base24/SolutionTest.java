package cn.base.base24;

public class SolutionTest {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(2);
        bst.insert(4);
        bst.insert(1);
        bst.insert(8);
        bst.insert(3);
        bst.insert(0);
        bst.insert(9);
        bst.insert(-2);
        BinarySearchTree.Node node = bst.find(6);
        BinarySearchTree.Node node1 = bst.find(4);
        bst.remove(2);
        bst.remove(8);

    }
}
