package cn.base.base12;

import java.util.Arrays;

public class SolutionTest {
    public static void main(String[] args) {
        int[] nums = {1,5,3,7,0,2,9,8,6,4};
//        new BucketSort().bucketSort(nums);
        System.out.println(Arrays.toString(nums));

        int[] nums2 = {1,5,3,7,0,2,9,8,6,4,1,5,3,7};
//        new CountingSort().countingSort(nums2);
        System.out.println(Arrays.toString(nums2));

        int[] nums3 = {123, 656, 765, 901, 434, 777, 872, 894, 999, 124, 321, 77, 78, 99};
        new RadixSort().radixSort(nums3, 3);
        System.out.println(Arrays.toString(nums3));
    }
}
