package cn.base.base12;

import java.util.ArrayList;
import java.util.List;

/**
 * 基数排序
 */
public class RadixSort {
    public void radixSort(int[] nums, int b) {
        int len = nums.length;
        List<Integer>[] buckets = new List[10];
        for (int i = 0; i < 10; i++) {
            buckets[i] = new ArrayList<Integer>();
        }
        int k = 0;
        int m = 1;
        while (k < b) {
            for (int i = 0; i < len; i++) {
                int index = (nums[i] / m) % 10;
                buckets[index].add(nums[i]);
            }
            int index = 0;
            for (int i = 0; i < 10; i++) {
                int length = buckets[i].size();
                for (int j = 0; j < length; j++) {
                    nums[index] = buckets[i].get(j);
                    index++;
                }
                buckets[i].clear();
            }
            m *= 10;
            k++;
        }
    }
}
