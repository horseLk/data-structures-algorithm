package cn.base.base16;

public class SolutionTest {
    public static void main(String[] args) {
        int[] nums = {0,3,4,5,5,5,6,7,8,8,8,9,9,10,11};
        System.out.println(new FindFirstNum().findFirstNum(nums, 9));

        System.out.println(new FindLastNumber().findLastNumber(nums, 8));

        System.out.println(new FindLargerNumber().findLargerNumber(nums, 2));

        System.out.println(new FindSmallerNumber().findSmallerNumber(nums, 2));

        int[] nums1 = {4,5,6,7,8,9,1,2,3};
        System.out.println(new FindFromCycleOrderArray().findInCycle(nums1, 0));
    }
}
