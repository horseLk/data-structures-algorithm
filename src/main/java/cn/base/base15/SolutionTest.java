package cn.base.base15;

public class SolutionTest {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4,5,6,7,8,9};
        System.out.println(new BinarySearch().binarySearchNonRecursion(nums, 0));
        System.out.println(new BinarySearch().binarySearchNonRecursion(nums, 11));


        System.out.println(new BinarySearch().binarySearchByRecursion(nums, 1));
        System.out.println(new BinarySearch().binarySearchByRecursion(nums, 11));

        System.out.println(new MySqrt().mySqrt(9));
    }
}
