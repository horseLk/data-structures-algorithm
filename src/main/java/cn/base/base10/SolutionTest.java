package cn.base.base10;

import java.util.Arrays;

public class SolutionTest {
    public static void main(String[] args) {
        int[] nums = {1,5,3,7,0,2,9,8,6,4};

//        new BubbleSort().bubbleSort(nums);

//        new InsertSort().insertSort(nums);

//        new SelectSort().selectSort(nums);

        new InsertSort().insertSort(nums);
        System.out.println(Arrays.toString(nums));

    }
}
