package cn.base.base11;

import java.util.Arrays;

public class SolutionTest {
    public static void main(String[] args) {
        int[] nums = {1,5,3,7,0,2,9,8,6,4};

//        new MergeSort().mergeSort(nums);

//        new QuickSort().quickSort(nums);

        System.out.println(new FindKNum().findNoKNum(nums, 5));

        System.out.println(Arrays.toString(nums));
    }
}
