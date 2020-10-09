package cn.base.base12;

import java.util.ArrayList;
import java.util.List;

/**
 * 桶排序
 */
public class BucketSort {
    public void bucketSort(int[] nums) {
        int len = nums.length;
        int m = 3;
        List<Integer>[] bucket = new List[m];
        for (int i = 0; i < m; i++) {
            bucket[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i < len; i++) {
            if (nums[i] / m >= m - 1) {
                bucket[m - 1].add(nums[i]);
            } else {
                bucket[nums[i] / m].add(nums[i]);
            }
        }
        for (int i = 0; i < m; i++) {
            insertSort(bucket[i]);
        }
        int index = 0;
        for (int i = 0; i < m; i++) {
            for (int num : bucket[i]) {
                nums[index++] = num;
            }
        }
    }

    private List<Integer> insertSort(List<Integer> nums) {
        int len = nums.size();
        for (int i = 1; i < len; i++) {
            int cur = nums.get(i);
            int j = i;
            for (; j >= 1 && nums.get(j - 1) > cur; j--) {
                nums.set(j, nums.get(j - 1));
            }
            nums.set(j, cur);
        }
        return nums;
    }
}
